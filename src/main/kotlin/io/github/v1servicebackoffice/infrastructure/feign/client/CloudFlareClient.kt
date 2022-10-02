package io.github.v1servicebackoffice.infrastructure.feign.client

import io.github.v1servicebackoffice.infrastructure.feign.dto.ResponseWrapper
import io.github.v1servicebackoffice.infrastructure.feign.dto.request.PostRecord
import io.github.v1servicebackoffice.infrastructure.feign.dto.response.PostRecordResponse
import io.github.v1servicebackoffice.infrastructure.feign.dto.response.QueryRecordResponse
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping

@FeignClient(name = "CloudFlareClient", url = "https://api.cloudflare.com/client/v4")
interface CloudFlareClient {

    @PostMapping("/zones/\${cloudflare.zone}/dns_records")
    fun createRecord(dnsRecord: PostRecord): ResponseWrapper<PostRecordResponse>

    @GetMapping("/zones/\${cloudflare.zone}/dns_records")
    fun queryRecord(): ResponseWrapper<List<QueryRecordResponse>>


}