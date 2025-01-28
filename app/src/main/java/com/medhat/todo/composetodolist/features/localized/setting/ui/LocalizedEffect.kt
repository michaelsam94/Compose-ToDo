package com.medhat.todo.composetodolist.features.localized.setting.ui

import com.medhat.todo.composetodolist.model.Language

sealed class LocalizedEffect {
    data class ApplyLanguage(val language: Language) : LocalizedEffect()
}
