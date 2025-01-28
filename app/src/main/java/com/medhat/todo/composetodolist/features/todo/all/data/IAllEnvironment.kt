package com.medhat.todo.composetodolist.features.todo.all.data

import com.medhat.todo.composetodolist.foundation.wrapper.DateTimeProvider
import com.medhat.todo.composetodolist.model.ToDoList
import com.medhat.todo.composetodolist.model.ToDoTask
import kotlinx.coroutines.flow.Flow

interface IAllEnvironment {
    val dateTimeProvider: DateTimeProvider
    fun getList(): Flow<List<ToDoList>>
    suspend fun toggleTaskStatus(toDoTask: ToDoTask)
    suspend fun deleteTask(task: ToDoTask)
}
