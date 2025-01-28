package com.medhat.todo.composetodolist.runtime

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.Surface
import androidx.core.view.WindowCompat
import com.medhat.todo.composetodolist.R
import com.medhat.todo.composetodolist.features.host.ui.Host
import com.medhat.todo.composetodolist.foundation.window.WindowState
import com.medhat.todo.composetodolist.foundation.window.rememberWindowState
import com.medhat.todo.composetodolist.runtime.navigation.MainNavHost
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var windowState: WindowState

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_ComposeToDoList_Light)
        super.onCreate(savedInstanceState)

        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            windowState = rememberWindowState()

            Host {
                Surface {
                    MainNavHost(windowState)
                }
            }
        }
    }
}

