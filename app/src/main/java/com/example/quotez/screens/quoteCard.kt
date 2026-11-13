package com.example.quotez.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.RequestQuote
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quotez.data.Quotes

@Composable
fun QuoteCard(item: Quotes, quoteClick: (Quotes) -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable(onClick = { quoteClick(item) }),
        colors = CardDefaults.cardColors(MaterialTheme.colorScheme.surfaceVariant),
        elevation = CardDefaults.cardElevation(10.dp),
        shape = ShapeDefaults.Large

        ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(IntrinsicSize.Min),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(modifier = Modifier
                .weight(0.25f)
                .fillMaxHeight()
            ){
            Icon(
                imageVector = Icons.Filled.RequestQuote,
                contentDescription = "Quote",
                modifier = Modifier
                    .fillMaxSize()
            )
        }

            Spacer(modifier = Modifier.width(5.dp))

            Column(
                modifier = Modifier
                    .weight(0.75f)
                    .padding(8.dp)
            ) {
                Text(
                    text = item.quote,
                    fontSize = 12.sp,
                    color = Color.Black
                )

                Spacer(modifier = Modifier.height(20.dp))

                HorizontalDivider(
                    modifier = Modifier
                        .height(5.dp),
                    color = Color.Black
                )

                Text(
                    text = item.author,
                    fontSize = 10.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.ExtraLight
                )
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Display() {
    QuoteCard(
        Quotes(
            "Quote 1",
            "Author 1",
        ),
        quoteClick = {}
    )
}
