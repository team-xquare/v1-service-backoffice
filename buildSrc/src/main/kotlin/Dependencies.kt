object Dependencies {
    const val KOTLIN_REFLECT = "org.jetbrains.kotlin:kotlin-reflect"
    const val KOTLIN_JDK = "org.jetbrains.kotlin:kotlin-stdlib-jdk8"

    const val SPRING_STARTER = "org.springframework.boot:spring-boot-starter-web"
    const val SPRING_VALIDATION = "org.springframework.boot:spring-boot-starter-validation"
    const val SPRING_SECURITY = "org.springframework.boot:spring-boot-starter-security"
    const val SPRING_CLOUD = "org.springframework.cloud:spring-cloud-dependencies:${PluginVersions.SPRING_CLOUD_VERSION}"
    const val SPRING_CONFIG = "org.springframework.cloud:spring-cloud-config-client"

    const val JACKSON = "com.fasterxml.jackson.module:jackson-module-kotlin"

    const val JPA = "org.springframework.boot:spring-boot-starter-data-jpa"
    const val MYSQL_CONNECTOR = "mysql:mysql-connector-java"

    const val SPRING_TEST = "org.springframework.boot:spring-boot-starter-test:${PluginVersions.SPRING_VERSION}"
    const val ASSERTJ = "org.assertj:assertj-core:${DependencyVersions.ASSERTJ}"
    const val FIREBASE = "com.google.firebase:firebase-admin:${DependencyVersions.FIREBASE}"

    const val OPENFEIGN = "org.springframework.cloud:spring-cloud-starter-openfeign:${DependencyVersions.OPENFEIGN}"

}
