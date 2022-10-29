package io.github.v1servicebackoffice.domain.service.presentation

import io.github.v1servicebackoffice.domain.service.presentation.dto.response.QueryServiceListResponse
import io.github.v1servicebackoffice.domain.service.service.ServiceService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
class ServiceController(
    private val serviceService: ServiceService
) {

    @GetMapping
    fun queryServiceList(): QueryServiceListResponse = serviceService.queryServiceList()

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{serviceId}")
    fun removeService(@PathVariable("serviceId") serviceId: UUID) = serviceService.removeService(serviceId)

}