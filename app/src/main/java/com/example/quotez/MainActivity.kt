package com.example.quotez

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.quotez.Hosts.Master

import com.example.quotez.ui.theme.QuotezTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuotezTheme {
                Master()
            }
        }
    }
}

