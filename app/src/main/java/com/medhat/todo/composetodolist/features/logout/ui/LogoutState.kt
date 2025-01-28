package com.medhat.todo.composetodolist.features.logout.ui

import androidx.compose.runtime.Immutable
import com.medhat.todo.composetodolist.model.User

@Immutable
data class LogoutState(val user: User = User())
