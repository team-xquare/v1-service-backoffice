package io.github.v1servicebackoffice.domain.service.domain.repository

import io.github.v1servicebackoffice.domain.service.domain.ServiceEntity
import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface ServiceRepository: CrudRepository<ServiceEntity, UUID> {
}