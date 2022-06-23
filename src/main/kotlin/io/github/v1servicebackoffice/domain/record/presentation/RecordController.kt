package io.github.v1servicebackoffice.domain.record.presentation

import io.github.v1servicebackoffice.domain.record.presentation.dto.request.PostRecordRequest
import io.github.v1servicebackoffice.domain.record.service.PostRecordService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
class RecordController(
    private val postRecordService: PostRecordService
) {

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/records")
    fun postRecord(@RequestBody @Valid request: PostRecordRequest) = postRecordService.postRecord(request)

}