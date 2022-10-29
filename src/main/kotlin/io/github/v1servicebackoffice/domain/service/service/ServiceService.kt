package io.github.v1servicebackoffice.domain.service.service

import io.github.v1servicebackoffice.domain.service.domain.exception.ServiceNotFoundException
import io.github.v1servicebackoffice.domain.service.domain.repository.ServiceRepository
import io.github.v1servicebackoffice.domain.service.presentation.dto.response.QueryServiceListElement
import io.github.v1servicebackoffice.domain.service.presentation.dto.response.QueryServiceListResponse
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class ServiceService(
    private val serviceRepository: ServiceRepository
) {

    fun queryServiceList(): QueryServiceListResponse {
        return QueryServiceListResponse(queryServices())
    }

    fun removeService(serviceId: UUID) {
        if(serviceRepository.findById(serviceId).isEmpty) {
            throw ServiceNotFoundException.EXCEPTION
        }

        serviceRepository.deleteById(serviceId)
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