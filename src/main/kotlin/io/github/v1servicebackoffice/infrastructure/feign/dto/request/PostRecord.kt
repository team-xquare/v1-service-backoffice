package io.github.v1servicebackoffice.infrastructure.feign.dto.request

class PostRecord(
    val name: String,
    val type: String,
    val content: String,
    val ttl: Int = 1,
)