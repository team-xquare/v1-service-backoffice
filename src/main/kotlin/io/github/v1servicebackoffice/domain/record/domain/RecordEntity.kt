package io.github.v1servicebackoffice.domain.record.domain

import io.github.v1servicebackoffice.domain.record.domain.types.RecordType
import io.github.v1servicebackoffice.global.entity.BaseUUIDEntity
import org.hibernate.annotations.GenericGenerator
import java.util.*
import javax.persistence.*


@Table(name = "tbl_record")
@Entity
class RecordEntity(

    @Id
    @Column(columnDefinition = "CHAR(32)")
    val id: String,

    @field:Column(length = 20)
    val name: String,

    @field:Column(length = 15)
    val content: String,

    @field:Enumerated(EnumType.STRING)
    @field:Column(length = 20)
    val type: RecordType

)