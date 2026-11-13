package com.example.quotez.Hosts

import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import com.example.quotez.data.Quotes
import com.example.quotez.screens.QuoteCardDetails
import com.example.quotez.screens.QuotesScreen


@Composable
fun Master() {
    val listState = rememberLazyListState()
    var data = remember {
        listOf(
            Quotes("The only way to do great work is to love what you do.", "Steve Jobs"),
            Quotes("It always seems impossible until it's done.", "Nelson Mandela"),
            Quotes(
                "The future belongs to those who believe in the beauty of their dreams.",
                "Eleanor Roosevelt"
            ),
            Quotes("In the middle of difficulty lies opportunity.", "Albert Einstein"),
            Quotes("Do what you can, with what you have, where you are.", "Theodore Roosevelt"),
            Quotes("Happiness depends upon ourselves.", "Aristotle"),
            Quotes("Act as if what you do makes a difference. It does.", "William James"),
            Quotes(
                "Success is not final, failure is not fatal: it is the courage to continue that counts.",
                "Winston Churchill"
            ),
            Quotes("Believe you can and you're halfway there.", "Theodore Roosevelt"),
            Quotes("Everything you've ever wanted is on the other side of fear.", "George Addair"),
            Quotes("The secret of getting ahead is getting started.", "Mark Twain"),
            Quotes("What we think, we become.", "Buddha"),
            Quotes("The best way out is always through.", "Robert Frost"),
            Quotes("You miss 100% of the shots you don't take.", "Wayne Gretzky"),
            Quotes("The journey of a thousand miles begins with one step.", "Lao Tzu"),
            Quotes("It does not matter how slowly you go as long as you do not stop.", "Confucius"),
            Quotes("Everything has beauty, but not everyone sees it.", "Confucius"),
            Quotes("If opportunity doesn't knock, build a door.", "Milton Berle"),
            Quotes(
                "Great things are done by a series of small things brought together.",
                "Vincent van Gogh"
            ),
            Quotes(
                "Keep your face always toward the sunshine, and shadows will fall behind you.",
                "Walt Whitman"
            ),
            Quotes("Turn your wounds into wisdom.", "Oprah Winfrey"),
            Quotes("The mind is everything. What you think you become.", "Buddha")
        )
    }

    var clickedQuote by rememberSaveable { mutableStateOf<Quotes?>(null) }

    val quoteClick = { quote: Quotes ->
        clickedQuote = quote
    }

    val onBackClick = {
        clickedQuote = null
    }


    if (clickedQuote == null) {
        QuotesScreen(
            data,
            listState,quoteClick
        )
    } else {
        QuoteCardDetails(data, clickedQuote!!,onBackClick)
    }
}


