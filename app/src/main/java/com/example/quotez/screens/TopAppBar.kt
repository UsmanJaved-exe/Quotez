package com.example.quotez.screens

import androidx.compose.foundation.clickable
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TopABar() {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = "QUOTES",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
        },
        colors = TopAppBarDefaults.topAppBarColors(Color(0xFFBDBBAE)),
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBBar(onBackClick: () -> Unit) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = "",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
        },
        colors = TopAppBarDefaults.topAppBarColors(Color(0xFF795762)),
        navigationIcon = { BackIcon(onBackClick) },
    )
}

@Composable
fun BackIcon(onBackClick: () -> Unit) {
    Icon(
        modifier = Modifier
            .clickable(onClick = { onBackClick() }),
        contentDescription = "",
        imageVector = Icons.Default.ArrowBackIosNew,
        tint = Color.Black
    )
}
