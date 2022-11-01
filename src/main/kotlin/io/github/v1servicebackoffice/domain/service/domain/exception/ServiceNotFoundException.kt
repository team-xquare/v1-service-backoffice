package io.github.v1servicebackoffice.domain.service.domain.exception

import io.github.v1servicebackoffice.global.error.BackOfficeException
import io.github.v1servicebackoffice.global.error.ErrorCode

class ServiceNotFoundException private constructor(): BackOfficeException(ErrorCode.SERVICE_NOT_FOUND) {

    companion object {
        @JvmField
        val EXCEPTION = ServiceNotFoundException()
    }


}