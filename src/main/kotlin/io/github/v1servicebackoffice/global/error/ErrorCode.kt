package io.github.v1servicebackoffice.global.error

enum class ErrorCode(
    val status: Int,
    val code: String,
    val message: String
) {
    INVALID_ARGUMENT(400, "INVALID_ARGUMENT", "Invalid argument"),

    OTHER_BAD_REQUEST(400, "FEIGN-400-1", "Other Bad Request."),
    OTHER_UNAUTHORIZED(401, "FEIGN-401-1", "Other Unauthorized."),
    OTHER_FORBIDDEN(403, "FEIGN-403-1", "Other Forbidden."),
    OTHER_EXPIRED_TOKEN(419, "FEIGN-419-1", "Other Expired Token."),

    INTERNAL_SERVER_ERROR(500, "BACKOFFICE-500-1", "Internal Server Error.");
}