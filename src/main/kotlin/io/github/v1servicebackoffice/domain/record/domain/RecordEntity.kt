package io.github.v1servicebackoffice.domain.record.domain

import io.github.v1servicebackoffice.domain.record.domain.types.RecordType
import io.github.v1servicebackoffice.global.entity.BaseUUIDEntity
import java.util.*
import javax.persistence.*


@Table(name = "tbl_record")
@Entity
class RecordEntity(

    @field:Column(length = 20)
    val name: String,

    @field:Column(length = 15)
    val content: String,

    @field:Enumerated(EnumType.STRING)
    @field:Column(length = 20)
    val type: RecordType

): BaseUUIDEntity()