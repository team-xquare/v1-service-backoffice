package io.github.v1servicebackoffice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class V1ServiceBackOfficeApplication

fun main(args: Array<String>) {
    runApplication<V1ServiceBackOfficeApplication>(*args)
}