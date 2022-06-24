package io.github.v1servicebackoffice.global.config

import com.fasterxml.jackson.databind.ObjectMapper
import io.github.v1servicebackoffice.global.error.ErrorHandlingFilter
import org.springframework.security.config.annotation.SecurityConfigurerAdapter
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.web.DefaultSecurityFilterChain
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter

class FilterConfig(
    private val objectMapper: ObjectMapper
): SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity>() { //TODO SecurityConfig에서 Config해주기

    override fun configure(builder: HttpSecurity) {
        builder.addFilterBefore(ErrorHandlingFilter(objectMapper), UsernamePasswordAuthenticationFilter::class.java)
    }

}