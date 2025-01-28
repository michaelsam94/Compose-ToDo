package com.medhat.todo.composetodolist.features.todo.groupmenu.data

import com.medhat.todo.composetodolist.foundation.wrapper.DateTimeProvider
import kotlinx.coroutines.flow.Flow

interface IGroupMenuEnvironment {
    val dateTimeProvider: DateTimeProvider
    suspend fun deleteGroup(groupId: String): Flow<Any>
    fun hasList(groupId: String): Flow<Boolean>
}
