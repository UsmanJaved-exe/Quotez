package com.example.quotez.hosts

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.quotez.data.Quotes

class QuoteViewModel : ViewModel() {
    var data =
        mutableListOf(
            Quotes(1,"The only way to do great work is to love what you do.", "Steve Jobs"),
            Quotes(2,"It always seems impossible until it's done.", "Nelson Mandela"),
            Quotes(
                3,"The future belongs to those who believe in the beauty of their dreams.",
                "Eleanor Roosevelt"
            ),
            Quotes(4,"In the middle of difficulty lies opportunity.", "Albert Einstein"),
            Quotes(5,"Do what you can, with what you have, where you are.", "Theodore Roosevelt"),
            Quotes(6,"Happiness depends upon ourselves.", "Aristotle"),
            Quotes(7,"Act as if what you do makes a difference. It does.", "William James"),
            Quotes(
                8,"Success is not final, failure is not fatal: it is the courage to continue that counts.",
                "Winston Churchill"
            ),
            Quotes(9,"Believe you can and you're halfway there.", "Theodore Roosevelt"),
            Quotes(10,"Everything you've ever wanted is on the other side of fear.", "George Addair"),
            Quotes(11,"The secret of getting ahead is getting started.", "Mark Twain"),
            Quotes(12,"What we think, we become.", "Buddha"),
            Quotes(13,"The best way out is always through.", "Robert Frost"),
            Quotes(14,"You miss 100% of the shots you don't take.", "Wayne Gretzky"),
            Quotes(15,"The journey of a thousand miles begins with one step.", "Lao Tzu"),
            Quotes(16,"It does not matter how slowly you go as long as you do not stop.", "Confucius"),
            Quotes(17,"Everything has beauty, but not everyone sees it.", "Confucius"),
            Quotes(18,"If opportunity doesn't knock, build a door.", "Milton Berle"),
            Quotes(
                19,"Great things are done by a series of small things brought together.",
                "Vincent van Gogh"
            ),
            Quotes(
                20,"Keep your face always toward the sunshine, and shadows will fall behind you.",
                "Walt Whitman"
            ),
            Quotes(21,"Turn your wounds into wisdom.", "Oprah Winfrey"),
            Quotes(22,"The mind is everything. What you think you become.", "Buddha")
        )

        var clickedQuote by mutableStateOf<Quotes?>(null)

        fun quoteClick(quote: Quotes) {
            clickedQuote = quote
        }

    }




