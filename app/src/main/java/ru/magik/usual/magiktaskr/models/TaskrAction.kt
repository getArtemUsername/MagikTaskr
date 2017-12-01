package ru.magik.usual.magiktaskr.models

import org.joda.time.DateTime
import ru.magik.usual.magiktaskr.models.static.DateTimeUtils.AppDateTimeZone

/**
 * Created by klevakin on 01.12.17.
 */
data class TaskrAction(
        val startTime: DateTime = DateTime.now(AppDateTimeZone),
        val estimationTime: Long,
        val endTime: DateTime?,
        val youWannaPomodoro: Boolean = false
)