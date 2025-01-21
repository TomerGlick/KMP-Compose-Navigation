package com.poalim.myapplication

import androidx.compose.ui.window.ComposeUIViewController
import platform.UIKit.UIViewController

@Suppress("unused")
fun MainViewController(): UIViewController = ComposeUIViewController(configure = { }) {
    App()
}