package com.medhat.todo.composetodolist.features.splash.data

import com.medhat.todo.composetodolist.foundation.datasource.preference.provider.CredentialProvider
import com.medhat.todo.composetodolist.model.Credential
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class SplashEnvironment @Inject constructor(
    private val credentialProvider: CredentialProvider
) : ISplashEnvironment {

    override fun getCredential(): Flow<Credential> {
        return credentialProvider.getCredential()
    }

}
