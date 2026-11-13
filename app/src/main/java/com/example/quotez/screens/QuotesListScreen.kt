package com.example.quotez.screens

import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import com.example.quotez.data.Quotes


//@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun QuotesScreen(
    data: List<Quotes>,
    listState: LazyListState,
    quoteClick: (quote: Quotes) -> Unit
) {
    Scaffold(
        topBar = { TopABar() },
    ) {innerPadding ->
        List(data, listState, quoteClick,innerPadding)
    }
}