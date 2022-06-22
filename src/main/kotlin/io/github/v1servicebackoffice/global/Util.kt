package io.github.v1servicebackoffice.global

import org.yaml.snakeyaml.util.EnumUtils

inline fun <reified T: Enum<T>> String.toEnum(): T {
    try {
        return EnumUtils.findEnumInsensitiveCase(T::class.java, this)
    } catch (e: IllegalArgumentException) {
        throw RuntimeException(e)
    }
}