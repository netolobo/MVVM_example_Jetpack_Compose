package com.netoloboapps.igtimod3mvvmexamplejetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.netoloboapps.igtimod3mvvmexamplejetpackcompose.ui.theme.IGTIMod3MVVMExampleJetpackComposeTheme
import com.netoloboapps.igtimod3mvvmexamplejetpackcompose.view.MainScreen
import com.netoloboapps.igtimod3mvvmexamplejetpackcompose.viewmodel.MainScreenViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IGTIMod3MVVMExampleJetpackComposeTheme {
                MVVMExampleApp()
            }
        }
    }
}

@Composable
private fun MVVMExampleApp(){
    val viewModel: MainScreenViewModel = viewModel()
    MainScreen(
        viewModel = viewModel
    )
}