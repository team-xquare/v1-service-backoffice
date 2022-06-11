plugins {
    kotlin("jvm") version "1.6.21"
    id("org.springframework.boot") version PluginVersions.SPRING_VERSION
    id("io.spring.dependency-management") version PluginVersions.DEPENDENCY_MANAGEMENT
    kotlin("plugin.spring") version PluginVersions.SPRING_PLUGIN
    kotlin("plugin.jpa") version PluginVersions.JPA_PLUGIN
    id("jacoco")
}

group = "io.github"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
}

dependencies {
    implementation(Dependencies.SPRING_STARTER)
    implementation(Dependencies.SPRING_VALIDATION)
    implementation(Dependencies.SPRING_SECURITY)

    implementation(Dependencies.JACKSON)

    implementation(Dependencies.JPA)
    runtimeOnly(Dependencies.MYSQL_CONNECTOR)

    implementation(Dependencies.OPENFEIGN)

    implementation(Dependencies.KOTLIN_REFLECT)
    implementation(Dependencies.KOTLIN_JDK)
    testImplementation(Dependencies.SPRING_TEST)
    testImplementation(Dependencies.ASSERTJ)
}

allOpen {
    annotation("javax.persistence.Entity")
    annotation("javax.persistence.MappedSuperclass")
    annotation("javax.persistence.Embeddable")
}

noArg {
    annotation("javax.persistence.Entity")
    annotation("javax.persistence.MappedSuperclass")
    annotation("javax.persistence.Embeddable")
}

tasks.getByName<Jar>("jar") {
    enabled = false
}

tasks.compileKotlin {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "17"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.test {
    finalizedBy(tasks.jacocoTestReport)
}

tasks.jacocoTestReport {
    reports {
        xml.outputLocation.set(File("${buildDir}/reports/jacoco/test/jacocoTestReport.xml"))
        xml.required.set(true)
        html.required.set(false)
    }
}