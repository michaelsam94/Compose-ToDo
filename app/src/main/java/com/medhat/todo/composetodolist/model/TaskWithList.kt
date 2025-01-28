package com.medhat.todo.composetodolist.model

data class TaskWithList(
    val list: ToDoList,
    val task: ToDoTask
)
