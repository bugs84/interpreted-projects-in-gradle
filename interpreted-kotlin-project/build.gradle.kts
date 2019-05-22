
import org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
import org.gradle.api.tasks.testing.logging.TestLogEvent.*
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

group = "cz.vondr.gradle"
version = "1.0-SNAPSHOT"

// KOTLIN SETUP -------------------------------------
plugins {
    kotlin("jvm") version "1.3.31"
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
}

repositories {
    mavenCentral()
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

// jUnit5 - SETUP ----------------------------------
tasks.withType<Test> {
    useJUnitPlatform()
}

val junitVersion = "5.4.2"
dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:$junitVersion")
    testImplementation("org.junit.jupiter:junit-jupiter-params:$junitVersion")
    testRuntime("org.junit.jupiter:junit-jupiter-engine:$junitVersion")
}

tasks.withType<Test> {
    testLogging {
        exceptionFormat = FULL
        events = setOf(PASSED, STARTED, FAILED, SKIPPED)
    }
}

// PROJECT SPECIFIC SETUP -------------------------

dependencies {
    implementation("org.apache.commons:commons-lang3:3.9")

    testImplementation("org.assertj:assertj-core:2.9.1")
}

tasks {

    val helloKotlin by registering(JavaExec::class) {
        main = "cz.vondr.gradle.HelloKotlinKt"
        classpath = sourceSets["main"].runtimeClasspath

        // To start with debugger => set 'true'
        debug = false
    }

}



