package com.medhat.todo.composetodolist.features.todo.all.ui

import com.medhat.todo.composetodolist.model.ToDoTask

sealed class AllAction {
    sealed class TaskAction : AllAction() {
        data class Delete(val task: ToDoTask) : TaskAction()
        data class OnToggleStatus(val task: ToDoTask) : TaskAction()
    }

    object ToggleCompleteTaskVisibility : AllAction()
}
