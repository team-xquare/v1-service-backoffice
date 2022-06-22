package io.github.v1servicebackoffice.domain.record.domain.repository

import io.github.v1servicebackoffice.domain.record.domain.RecordEntity
import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface RecordRepository: CrudRepository<RecordEntity, UUID> {
}