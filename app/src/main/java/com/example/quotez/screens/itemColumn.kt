package com.example.quotez.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun List() {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        userScrollEnabled = true,
    ) {

    }
}