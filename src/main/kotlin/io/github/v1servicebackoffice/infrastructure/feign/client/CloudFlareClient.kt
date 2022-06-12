package io.github.v1servicebackoffice.infrastructure.feign.client

import org.springframework.cloud.openfeign.FeignClient

@FeignClient(name = "CloudFlareClient", url = "https://api.cloudflare.com/client/v4")
interface CloudFlareClient {
}