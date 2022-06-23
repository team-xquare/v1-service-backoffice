package io.github.v1servicebackoffice.global.error

import io.github.v1servicebackoffice.global.error.ErrorCode

class ErrorResponse(
    private val errorCode: ErrorCode,
    private val message: String = errorCode.message,
) {

    private val status: Int = errorCode.status

    private val code: String = errorCode.code

    override fun toString(): String {
        return "{\n" +
                "\t\"status\": " + status +
                ",\t\"code\": \"" + code + '\"' +
                ",\n\t\"message\": \"" + message + '\"' +
                "\n}";
    }

}