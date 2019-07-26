package cz.vondr.gradle

import org.apache.commons.lang3.StringUtils

class HelloKotlin {

    fun getHello(): String {
        return StringUtils.join( "Hello", ' ', "Kotlin!")
    }
}