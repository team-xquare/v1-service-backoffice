package io.github.v1servicebackoffice.infrastructure.feign.error

import io.github.v1servicebackoffice.global.error.BackOfficeException
import io.github.v1servicebackoffice.global.error.ErrorCode

class OtherBadRequestException private constructor(): BackOfficeException(ErrorCode.OTHER_BAD_REQUEST) {
    companion object {
        @JvmField
        val EXCEPTION = OtherBadRequestException();
    }
}