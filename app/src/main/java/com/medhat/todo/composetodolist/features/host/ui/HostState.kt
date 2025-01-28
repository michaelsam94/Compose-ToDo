package com.medhat.todo.composetodolist.features.host.ui

import com.medhat.todo.composetodolist.model.Theme
import javax.annotation.concurrent.Immutable

@Immutable
data class HostState(val theme: Theme = Theme.SYSTEM)
