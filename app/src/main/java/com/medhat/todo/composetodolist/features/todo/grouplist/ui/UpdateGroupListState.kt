package com.medhat.todo.composetodolist.features.todo.grouplist.ui

import androidx.compose.runtime.Immutable
import com.medhat.todo.composetodolist.model.GroupIdWithList

@Immutable
data class UpdateGroupListState(
    val initialItems: List<GroupIdWithList> = listOf(),
    val items: List<GroupIdWithList> = listOf()
) {
    val isChanges = initialItems != items
}
