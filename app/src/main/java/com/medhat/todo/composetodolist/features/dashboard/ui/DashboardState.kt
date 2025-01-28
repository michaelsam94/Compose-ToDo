package com.medhat.todo.composetodolist.features.dashboard.ui

import androidx.compose.runtime.Immutable
import com.medhat.todo.composetodolist.model.User

@Immutable
data class DashboardState(val user: User = User())
