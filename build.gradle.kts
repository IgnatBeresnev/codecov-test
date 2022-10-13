import kotlinx.kover.api.DefaultJacocoEngine

plugins {
    kotlin("jvm") version "1.7.20"
    id("org.jetbrains.kotlinx.kover") version "0.6.1"
}

repositories {
    mavenCentral()
}

kover {
    engine.set(DefaultJacocoEngine)
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation(kotlin("test-junit"))
}

