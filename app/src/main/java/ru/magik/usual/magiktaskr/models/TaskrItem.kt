package ru.magik.usual.magiktaskr.models

import java.io.FileDescriptor

/**
 * Created by klevakin on 01.12.17.
 */
data class TaskrItem(
        val name: String,
        val priority: Int = 0,
        val description: String?,
        val iconId: String?
)