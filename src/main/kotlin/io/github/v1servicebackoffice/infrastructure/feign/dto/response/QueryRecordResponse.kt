package io.github.v1servicebackoffice.infrastructure.feign.dto.response

import io.github.v1servicebackoffice.domain.record.domain.types.RecordType

class QueryRecordResponse (
        val id: String,
        val name: String,
        val content: String,
        val type: RecordType
)