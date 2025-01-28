package com.medhat.todo.composetodolist.features.todo.grouplist.ui

import com.medhat.todo.composetodolist.model.GroupIdWithList

sealed class UpdateGroupListAction {

    data class Change(val item: GroupIdWithList) : UpdateGroupListAction()
    object Submit : UpdateGroupListAction()

}
