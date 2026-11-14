package com.example.quotez.Hosts

import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.quotez.screens.QuoteCardDetails
import com.example.quotez.screens.QuotesScreen


@Composable
fun Master() {
    val vm: QuoteViewModel = viewModel()
    val listState = rememberLazyListState()
    if (vm.clickedQuote == null) {
        QuotesScreen(
            vm.data,
            listState, { quote -> vm.quoteClick(quote) }
        )
    } else {
        QuoteCardDetails(vm.data, vm.clickedQuote!!, { vm.onBackClick() })
    }
}




