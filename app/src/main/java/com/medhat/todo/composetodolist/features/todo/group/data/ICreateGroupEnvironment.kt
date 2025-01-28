package com.medhat.todo.composetodolist.features.todo.group.data

import com.medhat.todo.composetodolist.foundation.wrapper.DateTimeProvider
import com.medhat.todo.composetodolist.foundation.wrapper.IdProvider
import com.medhat.todo.composetodolist.model.ToDoGroup
import kotlinx.coroutines.flow.Flow

interface ICreateGroupEnvironment {
    val idProvider: IdProvider
    val dateTimeProvider: DateTimeProvider
    suspend fun getGroup(groupId: String): Flow<ToDoGroup>
    suspend fun createGroup(name: String): Flow<String>
    suspend fun renameGroup(groupId: String, name: String): Flow<Any>
}
