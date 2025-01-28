package com.medhat.todo.composetodolist.features.splash.data

import com.medhat.todo.composetodolist.model.Credential
import kotlinx.coroutines.flow.Flow

interface ISplashEnvironment {
    fun getCredential(): Flow<Credential>
}
