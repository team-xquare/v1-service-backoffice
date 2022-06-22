package io.github.v1servicebackoffice.domain.record.presentation.dto.request

import javax.validation.constraints.NotNull

class PostRecordRequest {

    @NotNull
    lateinit var name: String
        private set

    @NotNull
    lateinit var type: String
        private set

    @NotNull
    lateinit var content: String
        private set

}