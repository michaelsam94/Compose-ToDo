package com.medhat.todo.composetodolist.features.host.data

import com.medhat.todo.composetodolist.model.Theme
import kotlinx.coroutines.flow.Flow

interface IHostEnvironment {
    fun getTheme(): Flow<Theme>
}
