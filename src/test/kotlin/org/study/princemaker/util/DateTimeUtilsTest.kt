package org.study.princemaker.util

import org.assertj.core.api.Assertions.assertThat
import java.time.LocalDateTime
import kotlin.test.Test

class DateTimeUtilsTest {
    @Test
    fun getLocalDateTimeStringTest() {
        val result = DateTimeUtils.getLocalDateTimeString(
            LocalDateTime.of(2023, 12, 21, 4, 30, 55)
        )

        assertThat(result).isEqualTo("2023-12-21 탄생")
    }
}