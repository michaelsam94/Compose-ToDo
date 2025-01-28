package com.medhat.todo.composetodolist.features.todo.search.data

import com.medhat.todo.composetodolist.model.ToDoList
import com.medhat.todo.composetodolist.model.ToDoTask
import kotlinx.coroutines.flow.Flow

interface ISearchEnvironment {
    fun searchList(query: String): Flow<List<ToDoList>>
    suspend fun toggleTaskStatus(toDoTask: ToDoTask)
    suspend fun deleteTask(task: ToDoTask)
}
