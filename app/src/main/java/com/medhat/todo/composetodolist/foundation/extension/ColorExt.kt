package com.medhat.todo.composetodolist.foundation.extension

import androidx.compose.ui.graphics.Color
import com.medhat.todo.composetodolist.features.todo.detail.ui.ColorItem
import com.medhat.todo.composetodolist.foundation.theme.ListBlue
import com.medhat.todo.composetodolist.foundation.theme.ListBrown
import com.medhat.todo.composetodolist.foundation.theme.ListGreen
import com.medhat.todo.composetodolist.foundation.theme.ListOrange
import com.medhat.todo.composetodolist.foundation.theme.ListPurple
import com.medhat.todo.composetodolist.foundation.theme.ListRed
import com.medhat.todo.composetodolist.foundation.theme.ListYellow
import com.medhat.todo.composetodolist.model.ToDoColor

fun ToDoColor.toColor() = when (this) {
    ToDoColor.BLUE -> ListBlue
    ToDoColor.RED -> ListRed
    ToDoColor.GREEN -> ListGreen
    ToDoColor.YELLOW -> ListYellow
    ToDoColor.ORANGE -> ListOrange
    ToDoColor.PURPLE -> ListPurple
    ToDoColor.BROWN -> ListBrown
}

fun Color.toToDoColor() = when (this) {
    ListRed -> ToDoColor.RED
    ListGreen -> ToDoColor.GREEN
    ListYellow -> ToDoColor.YELLOW
    ListOrange -> ToDoColor.ORANGE
    ListPurple -> ToDoColor.PURPLE
    ListBrown -> ToDoColor.BROWN
    else -> ToDoColor.BLUE
}

