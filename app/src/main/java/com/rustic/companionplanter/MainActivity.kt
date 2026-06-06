package com.rustic.companionplanter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.rustic.companionplanter.ui.CompanionPlanterTheme
import com.rustic.companionplanter.ui.MainScreen
import com.rustic.companionplanter.ui.MainViewModel

class MainActivity : ComponentActivity() {

    private val vm: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CompanionPlanterTheme {
                Surface(Modifier.fillMaxSize()) {
                    MainScreen(vm)
                }
            }
        }
    }
}