package com.example.quotez.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import com.example.quotez.data.Quotes

@Composable
fun QuoteCardDetails(data: List<Quotes>, clickedQuote: Quotes, onBackClick: () -> Unit) {
    Scaffold(
        topBar = { TopBBar(onBackClick) },
    ) { innerPadding ->
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(Color.Red, Color.Blue)
                    )
                )
                .padding(innerPadding)
        ) {
            QuoteCard(clickedQuote, quoteClick = {})
        }
    }
}