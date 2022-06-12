package io.github.v1servicebackoffice.infrastructure.feign.error

import io.github.v1servicebackoffice.global.error.BackOfficeException
import io.github.v1servicebackoffice.global.error.ErrorCode

class OtherForbiddenException private constructor(): BackOfficeException(ErrorCode.OTHER_FORBIDDEN) {
    companion object {
        @JvmField
        val EXCEPTION = OtherForbiddenException()
    }
}