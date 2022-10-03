package io.github.v1servicebackoffice.domain.record.service

import io.github.v1servicebackoffice.domain.record.domain.RecordEntity
import io.github.v1servicebackoffice.domain.record.domain.repository.RecordRepository
import io.github.v1servicebackoffice.domain.record.domain.types.RecordType
import io.github.v1servicebackoffice.domain.record.exception.RecordAlreadyExistException
import io.github.v1servicebackoffice.domain.record.presentation.dto.request.PostRecordRequest
import io.github.v1servicebackoffice.domain.record.presentation.dto.response.QueryRecordResponse
import io.github.v1servicebackoffice.domain.record.presentation.dto.response.QueryRecordResponseElement
import io.github.v1servicebackoffice.global.toEnum
import io.github.v1servicebackoffice.infrastructure.feign.client.CloudFlareClient
import io.github.v1servicebackoffice.infrastructure.feign.dto.request.PostRecord
import org.springframework.stereotype.Service

@Service
class RecordService(
    private val recordRepository: RecordRepository,
    private val cloudFlareClient: CloudFlareClient
) {

    fun postRecord(request: PostRecordRequest) {

        recordRepository.findByName(request.name)
            ?.let { throw RecordAlreadyExistException.EXCEPTION }

        val response = cloudFlareClient.createRecord(
            PostRecord(
                request.name,
                request.type.toEnum<RecordType>().name,
                request.content
            )
        )

        recordRepository.save(
            RecordEntity(
                id = response.result.id,
                name = request.name,
                content = request.content,
                type = request.type.toEnum()
            )
        )
    }

    fun queryRecord(queryString: String?): QueryRecordResponse {
        val recordResult = if (queryString != null) {
            recordRepository.findByNameStartingWith(queryString)
        } else {
            recordRepository.findAll()
        }

        return QueryRecordResponse(
            recordResult
                .map { QueryRecordResponseElement(it.id, it.name, it.type.toString(), it.content) }
                .toList()
        )
    }

}