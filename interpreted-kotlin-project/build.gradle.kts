import org.jetbrains.kotlin.gradle.tasks.KotlinCompile


// KOTLIN AND AUTO COMPILE SETUP -------------------------------------
plugins {
    kotlin("jvm") version "1.3.31"
}

group = "cz.vondr.gradle"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

//dependencies {
//	compile(kotlin("stdlib"))
//}

//tasks.withType<KotlinCompile> {
//	kotlinOptions {
//		jvmTarget = "1.8"
//	}
//}
//
//tasks.withType<KotlinTestCompile> {
//	kotlinOptions {
//		jvmTarget = "1.8"
//	}
//}
dependencies {
    implementation(kotlin("stdlib-jdk8"))

}

val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}
val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}

// PROJECT SPECIFIC SETUP -------------------------

dependencies {
    implementation("org.apache.commons:commons-lang3:3.9")
}


task("helloKotlin", JavaExec::class) {
    main = "cz.vondr.gradle.HelloKotlinKt"
    classpath = sourceSets["main"].runtimeClasspath

    //To start with debugger - set 'true'
    debug = false
}

