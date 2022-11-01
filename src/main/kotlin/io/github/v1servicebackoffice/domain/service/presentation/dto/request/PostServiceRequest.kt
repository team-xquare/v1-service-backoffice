package io.github.v1servicebackoffice.domain.service.presentation.dto.request

import io.github.v1servicebackoffice.domain.service.domain.types.Env
import io.github.v1servicebackoffice.domain.service.domain.types.Position
import io.github.v1servicebackoffice.domain.service.domain.types.Type
import javax.validation.constraints.NotNull
import kotlin.properties.Delegates

class PostServiceRequest {

        @NotNull
        lateinit var position: Position
                private set

        @NotNull
        lateinit var serviceName: String
                private set

        @NotNull
        lateinit var type: Type
                private set

        @NotNull
        lateinit var subdomain: String
                private set

        @NotNull
        lateinit var prefix: String
                private set

        @NotNull
        lateinit var env: Env
                private set

        var port by Delegates.notNull<Int>()
                private set

}