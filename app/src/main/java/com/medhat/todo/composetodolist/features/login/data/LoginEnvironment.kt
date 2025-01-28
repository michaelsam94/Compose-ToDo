package com.medhat.todo.composetodolist.features.login.data

import com.medhat.todo.composetodolist.foundation.datasource.preference.provider.CredentialProvider
import com.medhat.todo.composetodolist.foundation.datasource.preference.provider.UserProvider
import com.medhat.todo.composetodolist.foundation.datasource.server.ServerProvider
import com.medhat.todo.composetodolist.model.Credential
import com.medhat.todo.composetodolist.model.User
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.merge
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

class LoginEnvironment @Inject constructor(
    private val serverProvider: ServerProvider,
    private val credentialProvider: CredentialProvider,
    private val userProvider: UserProvider
) : ILoginEnvironment {

    override fun login(email: String, password: String): Flow<Any> {
        return merge(
            serverProvider.fetchCredential(),
            serverProvider.fetchUser(email, password)
        ).onEach {
            when (it) {
                is Credential -> credentialProvider.setCredential(it)
                is User -> userProvider.setUser(it)
            }
        }
    }

}
