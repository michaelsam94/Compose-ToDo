package com.medhat.todo.composetodolist.features.todo.search.ui

import androidx.compose.runtime.Immutable
import androidx.compose.ui.text.input.TextFieldValue
import com.medhat.todo.composetodolist.features.todo.all.ui.toItemAllState
import com.medhat.todo.composetodolist.model.ToDoList

@Immutable
data class SearchState(
    val searchText: TextFieldValue = TextFieldValue(),
    val lists: List<ToDoList> = listOf(),
) {
    val items = lists.toItemAllState()
}
