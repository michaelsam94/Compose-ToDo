package com.medhat.todo.composetodolist.model

data class ToDoTaskOverallCount(
    val allTaskCount: Int,
    val scheduledTodayTaskCount: Int,
    val scheduledTaskCount: Int,
)
