package com.medhat.todo.composetodolist.features.dashboard.data

import com.medhat.todo.composetodolist.model.ToDoTaskDiff
import com.medhat.todo.composetodolist.model.User
import kotlinx.coroutines.flow.Flow

interface IDashboardEnvironment {
    fun getUser(): Flow<User>
    fun listenToDoTaskDiff(): Flow<ToDoTaskDiff>
}
