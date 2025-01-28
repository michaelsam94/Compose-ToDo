package com.medhat.todo.composetodolist.features.logout.data

import com.medhat.todo.composetodolist.model.User
import kotlinx.coroutines.flow.Flow

interface ILogoutEnvironment {
    suspend fun logout()
    fun getUser(): Flow<User>
}
