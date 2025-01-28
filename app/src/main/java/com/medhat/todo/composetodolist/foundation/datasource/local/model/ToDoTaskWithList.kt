package com.medhat.todo.composetodolist.foundation.datasource.local.model

import androidx.room.Embedded

data class ToDoTaskWithList(
    @Embedded val task: ToDoTaskWithSteps,
    @Embedded val list: ToDoListDb
)
