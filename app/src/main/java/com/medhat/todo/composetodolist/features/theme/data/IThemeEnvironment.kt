package com.medhat.todo.composetodolist.features.theme.data

import com.medhat.todo.composetodolist.model.Theme
import kotlinx.coroutines.flow.Flow

interface IThemeEnvironment {
    fun getTheme(): Flow<Theme>
    suspend fun setTheme(theme: Theme)
}
