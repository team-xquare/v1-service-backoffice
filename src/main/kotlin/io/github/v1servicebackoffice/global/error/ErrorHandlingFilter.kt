package io.github.v1servicebackoffice.global.error

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.web.filter.OncePerRequestFilter
import javax.servlet.FilterChain
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class ErrorHandlingFilter(
    private val objectMapper: ObjectMapper
): OncePerRequestFilter() {

    override fun doFilterInternal(
        request: HttpServletRequest,
        response: HttpServletResponse,
        filterChain: FilterChain
    ) {
        try {
            filterChain.doFilter(request, response)
        } catch (e: BackOfficeException) {
            errorToJson(e.errorCode, response)
        } catch (e: Exception) {
            e.printStackTrace()
            errorToJson(ErrorCode.INTERNAL_SERVER_ERROR, response)
        }
    }

    private fun errorToJson(errorCode: ErrorCode, response: HttpServletResponse) {
        response.status = errorCode.status
        response.contentType = "application/json"
        response.writer.write(objectMapper.writeValueAsString(ErrorResponse(errorCode)))
    }

}