package io.github.v1servicebackoffice.infrastructure.feign

import feign.RequestInterceptor
import feign.RequestTemplate
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration

@Configuration
class ClientHeaderInterceptor(
    @Value("\${cloudflare.auth-email}")
    private var email: String,
    @Value("\${cloudflare.auth-key}")
    private var key: String
): RequestInterceptor {



    override fun apply(requestTemplate: RequestTemplate) {
//        requestTemplate.header("X-Auth-Email", email)
        requestTemplate.header("X-Auth-Key", key)
    }
}