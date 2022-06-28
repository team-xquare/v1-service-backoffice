package io.github.v1servicebackoffice.global.error

import com.fasterxml.jackson.annotation.JsonIgnore
import io.github.v1servicebackoffice.global.error.ErrorCode

class ErrorResponse(
    @JsonIgnore
    val errorCode: ErrorCode,
    val message: String = errorCode.message,
) {

    fun getStatus(): Int = errorCode.status

    fun getCode(): String = errorCode.code

}