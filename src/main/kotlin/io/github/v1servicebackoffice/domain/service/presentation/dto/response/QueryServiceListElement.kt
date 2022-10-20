package io.github.v1servicebackoffice.domain.service.presentation.dto.response

import io.github.v1servicebackoffice.domain.service.domain.types.Env
import io.github.v1servicebackoffice.domain.service.domain.types.Position
import io.github.v1servicebackoffice.domain.service.domain.types.Type

class QueryServiceListElement(
    val position: Position,
    val serviceName: String,
    val type: Type,
    val url: String,
    val env: Env,
    val port: Int
)