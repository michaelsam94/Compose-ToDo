package com.medhat.todo.composetodolist.foundation.extension

import com.medhat.todo.composetodolist.model.Credential

fun Credential.isLoggedIn() = token.isNotBlank()
