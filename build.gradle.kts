val ktorVersion: String by project
val kotlinVersion: String by project
val logbackVersion: String by project
val koinKtorVersion: String by project

plugins {
    application
    kotlin("jvm") version "1.7.21"
    id("io.ktor.plugin") version "2.1.3"
    id("org.jetbrains.kotlin.plugin.serialization") version "1.7.21"
}

group = "com.ahanafrifat"
version = "0.0.1"
application {
    mainClass.set("io.ktor.server.netty.EngineMain")

    val isDevelopment: Boolean = project.ext.has("development")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
}

repositories {
    mavenCentral()
}

dependencies {
//    implementation("io.ktor:ktor-server-content-negotiation-jvm:$ktorVersion")
//    implementation("io.ktor:ktor-server-core-jvm:$ktorVersion")
//    implementation("io.ktor:ktor-serialization-kotlinx-json-jvm:$ktorVersion")
//    implementation("io.ktor:ktor-server-call-logging-jvm:$ktorVersion")
//    implementation("io.ktor:ktor-server-netty-jvm:$ktorVersion")
//    implementation("ch.qos.logback:logback-classic:$logbackVersion")
//
//    testImplementation("io.ktor:ktor-server-tests-jvm:$ktorVersion")
//    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlinVersion")
//
//    // Koin for Ktor
//    implementation("io.insert-koin:koin-ktor:$koinKtorVersion")
//// SLF4J Logger
//    implementation("io.insert-koin:koin-logger-slf4j:$koinKtorVersion")

    implementation("io.ktor:ktor-server-core:$ktorVersion")
    implementation("io.ktor:ktor-serialization-kotlinx-json:$ktorVersion")
    implementation("io.ktor:ktor-server-netty:$ktorVersion")
    implementation("ch.qos.logback:logback-classic:$logbackVersion")

    implementation("io.ktor:ktor-server-call-logging:$ktorVersion")
    implementation("io.ktor:ktor-server-status-pages:$ktorVersion")
    implementation("io.ktor:ktor-server-content-negotiation:$ktorVersion")
    implementation("io.ktor:ktor-server-default-headers:$ktorVersion")

    testImplementation("io.ktor:ktor-server-tests:$ktorVersion")
    testImplementation("org.jetbrains.kotlin:kotlin-test:$kotlinVersion")

    implementation("io.insert-koin:koin-ktor:$koinKtorVersion")
    implementation("io.insert-koin:koin-logger-slf4j:$koinKtorVersion")

}