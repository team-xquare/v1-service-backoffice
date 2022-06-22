package io.github.v1servicebackoffice.infrastructure.feign.client

import feign.Headers
import io.github.v1servicebackoffice.infrastructure.feign.dto.ResponseWrapper
import io.github.v1servicebackoffice.infrastructure.feign.dto.request.PostRecord
import io.github.v1servicebackoffice.infrastructure.feign.dto.response.PostRecordResponse
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestHeader

@FeignClient(name = "CloudFlareClient", url = "https://api.cloudflare.com/client/v4")
interface CloudFlareClient {

    @PostMapping("/zones/\${cloudflare.zone}/dns_records")
    fun createRecord(dnsRecord: PostRecord): ResponseWrapper<PostRecordResponse>


}