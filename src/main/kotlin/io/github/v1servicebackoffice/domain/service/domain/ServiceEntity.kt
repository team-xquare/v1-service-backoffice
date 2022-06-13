package io.github.v1servicebackoffice.domain.service.domain

import io.github.v1servicebackoffice.domain.service.domain.types.Env
import io.github.v1servicebackoffice.domain.service.domain.types.Position
import io.github.v1servicebackoffice.domain.service.domain.types.Type
import java.util.*
import javax.persistence.*
import javax.validation.constraints.NotNull

@Table(name = "tbl_service")
@Entity
class ServiceEntity private constructor(
    @Id
    @Column(columnDefinition = "BINARY(16)")
    val id: UUID = UUID(0, 0),

    @field:NotNull
    @field:Enumerated(EnumType.STRING)
    @field:Column(columnDefinition = "VARCHAR(20) default 'FRONTEND'")
    val position: Position,

    @field:NotNull
    @field:Column(columnDefinition = "VARCHAR(20) default '이름을 바꿔주세요'")
    val name: String,

    @field:NotNull
    @field:Enumerated(EnumType.STRING)
    @field:Column(columnDefinition = "VARCHAR(7) default 'SERVICE'")
    val type: Type,

    @field:NotNull
    @field:Column(length = 20)
    val subdomain: String,

    @field:NotNull
    @field:Column(columnDefinition = "VARCHAR(20) default '/'")
    val prefix: String,

    @field:NotNull
    @field:Column(columnDefinition = "INT default 80")
    val port: Int,

    @field:NotNull
    @field:Enumerated(EnumType.STRING)
    @field:Column(columnDefinition = "CHAR(4) default 'PROD'")
    val env: Env
) {
    companion object {
        operator fun invoke(
            position: Position?,
            name: String?,
            type: Type?,
            subdomain: String,
            prefix: String?,
            port: Int?,
            env: Env?
        ) = ServiceEntity(
            position = position ?: Position.FRONTEND,
            name = name ?: "이름을 바꿔주세요",
            type = type ?: Type.SERVICE,
            subdomain = subdomain,
            prefix = prefix ?: "/",
            port = port ?: 80,
            env = env ?: Env.PROD
        )

    }
}