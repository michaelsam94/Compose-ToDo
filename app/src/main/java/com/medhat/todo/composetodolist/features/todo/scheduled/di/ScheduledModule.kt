package com.medhat.todo.composetodolist.features.todo.scheduled.di

import com.medhat.todo.composetodolist.features.todo.scheduled.data.IScheduledEnvironment
import com.medhat.todo.composetodolist.features.todo.scheduled.data.ScheduledEnvironment
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class ScheduledModule {

    @Binds
    abstract fun provideEnvironment(
        environment: ScheduledEnvironment
    ): IScheduledEnvironment

}
