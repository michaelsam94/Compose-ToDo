package com.wisnu.kurniawan.composetodolist.foundation.extension

import com.wisnu.kurniawan.composetodolist.features.todo.scheduled.ui.ToDoTaskItem
import com.wisnu.kurniawan.composetodolist.model.ToDoList
import com.wisnu.kurniawan.composetodolist.model.ToDoStatus
import com.wisnu.kurniawan.composetodolist.model.ToDoTask

fun List<Pair<ToDoTask, ToDoList>>.toToDoTaskItem(): List<ToDoTaskItem> {
    val items = mutableListOf<ToDoTaskItem>()

    if (isEmpty()) return items

    groupBy { (task, _) -> task.dueDate?.toLocalDate() }
        .filter { it.key != null }
        .forEach { (key, value) ->
            items.add(ToDoTaskItem.Header(key!!))

            value.forEach { (task, list) ->
                when (task.status) {
                    ToDoStatus.IN_PROGRESS -> {
                        items.add(ToDoTaskItem.InProgress(task, list))
                    }
                    ToDoStatus.COMPLETE -> {
                        items.add(ToDoTaskItem.Complete(task, list))
                    }
                }
            }
        }

    return items
}

fun ToDoTaskItem.identifier() = when (this) {
    is ToDoTaskItem.Header -> date.toString()
    is ToDoTaskItem.Complete -> toDoTask.id
    is ToDoTaskItem.InProgress -> toDoTask.id
}
