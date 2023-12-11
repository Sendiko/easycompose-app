package com.sendiko.easycompose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.sendiko.easycompose.R
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    onNavigate: () -> Unit
) {
    LaunchedEffect(
        key1 = null,
        block = {
            delay(500)
            onNavigate()
        }
    )
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomStart
    ){
        Image(
            painter = painterResource(id = R.drawable.logo_long),
            contentDescription = null,
            modifier = Modifier.fillMaxWidth()
        )
    }
}