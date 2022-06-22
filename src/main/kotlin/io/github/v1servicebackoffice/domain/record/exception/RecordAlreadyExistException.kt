package io.github.v1servicebackoffice.domain.record.exception

import io.github.v1servicebackoffice.global.error.BackOfficeException
import io.github.v1servicebackoffice.global.error.ErrorCode

class RecordAlreadyExistException private constructor(): BackOfficeException(ErrorCode.RECORD_ALREADY_EXIST) {

    companion object {
        @JvmField
        val EXCEPTION = RecordAlreadyExistException()
    }

}