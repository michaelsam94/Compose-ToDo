package com.medhat.todo.composetodolist.features.todo.group.ui

sealed class CreateGroupEffect {
    object HideScreen : CreateGroupEffect()
    data class ShowUpdateGroupListScreen(val groupId: String) : CreateGroupEffect()
}
