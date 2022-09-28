package io.github.v1servicebackoffice.domain.record.presentation

import io.github.v1servicebackoffice.domain.record.presentation.dto.request.PostRecordRequest
import io.github.v1servicebackoffice.domain.record.service.RecordService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RequestMapping("/records")
@RestController
class RecordController(
    private val recordService: RecordService
) {

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    fun postRecord(@RequestBody @Valid request: PostRecordRequest) = recordService.postRecord(request)

    @GetMapping
    fun queryRecord(@RequestParam("q") queryString: String) = recordService.queryRecord(queryString)

}