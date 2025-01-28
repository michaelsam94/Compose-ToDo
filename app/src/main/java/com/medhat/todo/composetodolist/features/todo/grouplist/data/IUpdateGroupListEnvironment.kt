package com.medhat.todo.composetodolist.features.todo.grouplist.data

import com.medhat.todo.composetodolist.foundation.wrapper.DateTimeProvider
import com.medhat.todo.composetodolist.model.GroupIdWithList
import kotlinx.coroutines.flow.Flow

interface IUpdateGroupListEnvironment {
    val dateTimeProvider: DateTimeProvider
    fun getListWithUnGroupList(groupId: String): Flow<List<GroupIdWithList>>
    suspend fun updateList(data: List<GroupIdWithList>)
}
