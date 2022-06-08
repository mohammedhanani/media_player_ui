package com.adrenoffeine.test.mediaplayer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.adrenoffeine.test.mediaplayer.ui.theme.HomeScreen
import com.adrenoffeine.test.mediaplayer.ui.theme.MediaplayerTheme

class MainActivity : ComponentActivity() {
    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MediaplayerTheme {
                // A surface container using the 'background' color from the theme
                //Surface(color = MaterialTheme.colors.background) { code here !! }
                HomeScreen()
            }
        }
    }
}



