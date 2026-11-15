package com.example.quotez.Hosts

import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.quotez.screens.QuoteCardDetails
import com.example.quotez.screens.QuotesScreen


@Composable
fun Master() {
    val vm: QuoteViewModel = viewModel()

    val navController = rememberNavController()
    NavHost(navController, "QuotesScreen") {
        composable("QuotesScreen") {
            QuotesScreen(
                vm.data,
                listState = rememberLazyListState(),
                { quote -> vm.quoteClick(quote) },navController)
        }

        composable("QuoteCardDetails") {
            QuoteCardDetails(vm.data, vm.clickedQuote!!, { vm.onBackClick() })
        }
    }


    val listState = rememberLazyListState()

    QuotesScreen(vm.data, listState, { quote -> vm.quoteClick(quote) }, navController)
    QuoteCardDetails(vm.data, vm.clickedQuote!!, { vm.onBackClick() })
}




