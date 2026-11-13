package com.example.quotez.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.quotez.data.Quotes


@Composable
fun List(
    data: List<Quotes>,
    listState: LazyListState,
    quoteClick: (quote: Quotes) -> Unit,
    innerPadding: PaddingValues
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding),
        state = listState,
        userScrollEnabled = true,
    ) {
        items(data) { item ->
            QuoteCard(item,quoteClick)
        }
    }
}
