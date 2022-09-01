plugins {
    kotlin("jvm") version "1.6.21"
    id("org.jetbrains.kotlinx.kover") version "0.6.0"
}

repositories {
    mavenCentral()
}

kover {
    engine.set(kotlinx.kover.api.DefaultJacocoEngine)
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation(kotlin("test-junit"))
}

