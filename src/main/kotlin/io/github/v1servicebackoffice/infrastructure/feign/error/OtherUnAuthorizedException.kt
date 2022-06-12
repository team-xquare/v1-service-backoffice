package io.github.v1servicebackoffice.infrastructure.feign.error

import io.github.v1servicebackoffice.global.error.BackOfficeException
import io.github.v1servicebackoffice.global.error.ErrorCode

class OtherUnAuthorizedException private constructor(): BackOfficeException(ErrorCode.OTHER_UNAUTHORIZED) {
    companion object {
        @JvmField
        val EXCEPTION = OtherUnAuthorizedException()
    }
}