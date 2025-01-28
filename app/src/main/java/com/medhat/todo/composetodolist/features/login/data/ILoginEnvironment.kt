package com.medhat.todo.composetodolist.features.login.data

import kotlinx.coroutines.flow.Flow

interface ILoginEnvironment {
    fun login(email: String, password: String): Flow<Any>
}
