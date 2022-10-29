package io.github.v1servicebackoffice.global.error

enum class ErrorCode(
    val status: Int,
    val code: String,
    val message: String
) {
    RECORD_ALREADY_EXIST(409, "RECORD-409-1", "Record already exist"),

    SERVICE_NOT_FOUND(404, "SERVICE-404-1", "Service Not Found"),

    OTHER_BAD_REQUEST(400, "FEIGN-400-1", "Other Bad Request."),
    OTHER_UNAUTHORIZED(401, "FEIGN-401-1", "Other Unauthorized."),
    OTHER_FORBIDDEN(403, "FEIGN-403-1", "Other Forbidden."),
    OTHER_EXPIRED_TOKEN(419, "FEIGN-419-1", "Other Expired Token."),
  
    INVALID_ARGUMENT(400, "BACKOFFICE-400-1", "Invalid argument"),

    INTERNAL_SERVER_ERROR(500, "BACKOFFICE-500-1", "Internal Server Error.");
}