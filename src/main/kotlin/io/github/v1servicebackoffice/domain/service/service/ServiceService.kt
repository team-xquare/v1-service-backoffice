package io.github.v1servicebackoffice.domain.service.service

import io.github.v1servicebackoffice.domain.service.domain.repository.ServiceRepository
import io.github.v1servicebackoffice.domain.service.presentation.dto.response.QueryServiceListElement
import io.github.v1servicebackoffice.domain.service.presentation.dto.response.QueryServiceListResponse
import org.springframework.stereotype.Service

@Service
class ServiceService(
    private val serviceRepository: ServiceRepository
) {

    fun queryServiceList(): QueryServiceListResponse {
        return QueryServiceListResponse(
            serviceRepository.findAll()
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
        )
    }

}