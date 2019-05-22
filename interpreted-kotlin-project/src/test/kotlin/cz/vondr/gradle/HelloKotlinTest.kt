package cz.vondr.gradle

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HelloKotlinTest {

    @Test
    fun `getHello returns correct string`() {
        // given
        val helloKotlin = HelloKotlin()

        // when
        val result = helloKotlin.getHello()

        // then
        assertThat(result).isEqualTo("Hello Kotlin!")
    }
}