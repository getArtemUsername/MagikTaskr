package ru.magik.usual.magiktaskr.models.static

import org.joda.time.DateTime
import org.joda.time.DateTimeZone
import java.util.*

/**
 * Created by klevakin on 01.12.17.
 */
object DateTimeUtils {
    val AppDateTimeZone: DateTimeZone =
            DateTimeZone.forTimeZone(TimeZone.getTimeZone("Asia/Yekaterinburg"))
}