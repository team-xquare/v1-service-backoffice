package io.github.v1servicebackoffice.global.error

enum class ErrorCode(
    val status: Int,
    val code: String,
    val message: String
) {
    OtherUnAuthorized(401, "FEIGN-401-1", "Other Unauthorized."),
    OtherForbidden(403, "FEIGN-403-1", "Other Forbidden."),
    OtherExpiredToken(419, "FEIGN-419-1", "Other Expired Token."),
    OtherBadRequest(400, "FEIGN-400-1", "Other Bad Request."),

    INTERNAL_SERVER_ERROR(500, "BACKOFFICE-500-1", "Internal Server Error.");
}