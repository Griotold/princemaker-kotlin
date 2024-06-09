package org.study.princemaker.util

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

/**
 * yyyy-MM-dd 탄생
 * */
object DateTimeUtils {

    fun getLocalDateTimeString(localDateTime: LocalDateTime): String {
        return localDateTime.format(
            DateTimeFormatter.ofPattern("yyyy-MM-dd 탄생")
        )
    }
}