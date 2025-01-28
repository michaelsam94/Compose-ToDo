package com.medhat.todo.composetodolist.foundation.di

import com.medhat.todo.composetodolist.foundation.wrapper.DateTimeProvider
import com.medhat.todo.composetodolist.foundation.wrapper.DateTimeProviderImpl
import com.medhat.todo.composetodolist.foundation.wrapper.IdProvider
import com.medhat.todo.composetodolist.foundation.wrapper.IdProviderImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object CommonModule {

    @Singleton
    @Provides
    fun provideIdProvider(): IdProvider {
        return IdProviderImpl()
    }

    @Singleton
    @Provides
    fun provideDateTimeProvider(): DateTimeProvider {
        return DateTimeProviderImpl()
    }

}
