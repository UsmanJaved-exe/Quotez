package com.example.quotez.hosts

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
                data = vm.data,
                listState = rememberLazyListState(),
                quoteClick = { quote -> vm.quoteClick(quote) },
                toNextScreen = { navController.navigate("QuoteCardDetails") })
        }

        composable("QuoteCardDetails") {
            vm.clickedQuote?.let { clickedQuote ->
                QuoteCardDetails(
                    clickedQuote = clickedQuote,
                    onBackClick = {
                        navController.popBackStack()
                    })
            }

        }
    }


    //    QuotesScreen(vm.data, listState, { quote -> vm.quoteClick(quote) }, toNextScreen)
//    vm.clickedQuote?.let { QuoteCardDetails( it, { vm.onBackClick() },toNextScreen,toPreviousScreen) }
}




