package io.github.v1servicebackoffice.global.error

abstract class BackOfficeException(
    val errorCode: ErrorCode
): RuntimeException() {
    override fun fillInStackTrace(): Throwable {
        return this
    }
}