package io.github.v1servicebackoffice.domain.record.domain

import io.github.v1servicebackoffice.domain.record.domain.types.RecordType
import javax.persistence.*


@Table(name = "tbl_record")
@Entity
class RecordEntity(

    @Id
    @Column(columnDefinition = "CHAR(32)")
    val id: String,

    @Column(length = 50, unique = true)
    var name: String,

    @Column(length = 50)
    var content: String,

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    var type: RecordType

)