package io.github.v1servicebackoffice.global.entity

import org.hibernate.annotations.GenericGenerator
import java.util.UUID
import javax.persistence.*

@MappedSuperclass
abstract class BaseUUIDEntity(
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(columnDefinition = "BINARY(16)")
    val id: UUID = UUID(0, 0)
)