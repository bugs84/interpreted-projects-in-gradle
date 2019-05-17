package cz.vondr.gradle

import org.apache.commons.lang3.StringUtils

fun main() {
    println(HelloKotlin().getHello())
}

class HelloKotlin {

    fun getHello(): String {
        return StringUtils.join( "Hello", ' ', "Kotlin!")
    }
}