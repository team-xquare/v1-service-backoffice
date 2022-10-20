package io.github.v1servicebackoffice.domain.service.presentation

import io.github.v1servicebackoffice.domain.service.presentation.dto.response.QueryServiceListResponse
import io.github.v1servicebackoffice.domain.service.service.ServiceService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ServiceController(
    private val serviceService: ServiceService
) {

    @GetMapping
    fun queryServiceList(): QueryServiceListResponse = serviceService.queryServiceList()

}