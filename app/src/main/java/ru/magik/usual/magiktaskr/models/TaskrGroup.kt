package ru.magik.usual.magiktaskr.models

/**
 * Created by klevakin on 01.12.17.
 */
data class TaskrGroup(val name: String, val items: List<TaskrGroup>)