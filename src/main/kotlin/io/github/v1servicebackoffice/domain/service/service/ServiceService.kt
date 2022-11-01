package io.github.v1servicebackoffice.domain.service.service

import io.github.v1servicebackoffice.domain.service.domain.ServiceEntity
import io.github.v1servicebackoffice.domain.service.domain.repository.ServiceRepository
import io.github.v1servicebackoffice.domain.service.presentation.dto.request.PostServiceRequest
import io.github.v1servicebackoffice.domain.service.presentation.dto.response.QueryServiceListElement
import io.github.v1servicebackoffice.domain.service.presentation.dto.response.QueryServiceListResponse
import org.springframework.stereotype.Service

@Service
class ServiceService(
    private val serviceRepository: ServiceRepository
) {

    fun queryServiceList(): QueryServiceListResponse {
        return QueryServiceListResponse(queryServices())
    }

    fun postService(request: PostServiceRequest) {
        serviceRepository.save(
            ServiceEntity(
                request.position,
                request.serviceName,
                request.type,
                request.subdomain,
                request.prefix,
                request.port,
                request.env
            )
        )
    }

    private fun queryServices(): List<QueryServiceListElement> = serviceRepository.findAll()
        .map {
            QueryServiceListElement(
                it.position,
                it.name,
                it.type,
                it.getServiceUrl(),
                it.env,
                it.port
            )
        }

}