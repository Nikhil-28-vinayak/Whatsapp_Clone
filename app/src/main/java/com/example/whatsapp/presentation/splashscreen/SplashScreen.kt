package com.example.whatsapp.presentation.splashscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.whatsapp.R

@Composable
@Preview(showBackground = true)
fun SplashScreen(){
    Box(modifier = Modifier.fillMaxSize()) {
        Image(painter = painterResource(R.drawable.whatsapp_icon), contentDescription = null,
            modifier = Modifier.size(80.dp))
    }
}