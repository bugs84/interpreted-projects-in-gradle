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

// PROJECT SPECIFIC SETUP -------------------------

dependencies {
    implementation("org.apache.commons:commons-lang3:3.9")
}

tasks {

    val helloKotlin by registering(JavaExec::class) {
        main = "cz.vondr.gradle.HelloKotlinKt"
        classpath = sourceSets["main"].runtimeClasspath

        // To start with debugger => set 'true'
        debug = false
    }

}



