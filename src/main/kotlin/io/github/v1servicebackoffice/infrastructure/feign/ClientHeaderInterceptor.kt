package io.github.v1servicebackoffice.infrastructure.feign

import feign.RequestInterceptor
import feign.RequestTemplate
import org.springframework.beans.factory.annotation.Value

class ClientHeaderInterceptor: RequestInterceptor {

    @Value("\${cloudflare.auth-email}")
    lateinit var email: String
    @Value("\${cloudflare.auth-key}")
    lateinit var key: String

    override fun apply(requestTemplate: RequestTemplate) {
        requestTemplate.header("X-Auth-Email", email)
        requestTemplate.header("X-Auth-Key", key)
    }
}