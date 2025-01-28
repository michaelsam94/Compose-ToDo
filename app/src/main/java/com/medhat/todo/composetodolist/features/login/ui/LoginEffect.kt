package com.medhat.todo.composetodolist.features.login.ui

sealed class LoginEffect {
    object NavigateToDashboard : LoginEffect()
}
