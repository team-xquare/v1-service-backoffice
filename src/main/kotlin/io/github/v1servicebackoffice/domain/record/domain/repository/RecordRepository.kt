package io.github.v1servicebackoffice.domain.record.domain.repository

import io.github.v1servicebackoffice.domain.record.domain.RecordEntity
import org.springframework.data.repository.CrudRepository

interface RecordRepository: CrudRepository<RecordEntity, String> {
    override fun findAll(): List<RecordEntity>
    fun findByName(name: String): RecordEntity?
    fun findByNameStartingWith(name: String): List<RecordEntity>
}