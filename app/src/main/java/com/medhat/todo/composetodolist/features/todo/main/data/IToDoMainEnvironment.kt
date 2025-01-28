package com.medhat.todo.composetodolist.features.todo.main.data

import com.medhat.todo.composetodolist.foundation.wrapper.DateTimeProvider
import com.medhat.todo.composetodolist.model.ToDoGroup
import com.medhat.todo.composetodolist.model.ToDoList
import com.medhat.todo.composetodolist.model.ToDoTaskOverallCount
import kotlinx.coroutines.flow.Flow

interface IToDoMainEnvironment {
    val dateTimeProvider: DateTimeProvider
    fun getGroup(): Flow<List<ToDoGroup>>
    fun getOverallCount(): Flow<ToDoTaskOverallCount>
    suspend fun deleteList(list: ToDoList)
}
