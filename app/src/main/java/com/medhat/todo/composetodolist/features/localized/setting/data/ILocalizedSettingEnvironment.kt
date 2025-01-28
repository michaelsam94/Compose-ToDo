package com.medhat.todo.composetodolist.features.localized.setting.data

import com.medhat.todo.composetodolist.model.Language
import kotlinx.coroutines.flow.Flow

interface ILocalizedSettingEnvironment {
    fun getLanguage(): Flow<Language>
    suspend fun setLanguage(language: Language)
}

