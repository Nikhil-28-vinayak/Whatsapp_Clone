package com.example.whatsapp.presentation.splashscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Popup
import androidx.navigation.NavController
import com.example.whatsapp.R
import com.example.whatsapp.presentation.navigation.Routes
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController){

    LaunchedEffect(Unit) {
        delay(1000)
        navController.navigate(Routes.WelcomeScreen){
            popUpTo<Routes.SplashScreen>{inclusive=true}
        }

    }

    Box(modifier = Modifier.fillMaxSize()) {
        Image(painter = painterResource(R.drawable.whatsapp_icon), contentDescription = null,
            modifier = Modifier.size(80.dp)
                .align(alignment = Alignment.Center))
    }
    Column(modifier = Modifier.fillMaxSize().padding(bottom = 20.dp), verticalArrangement = Arrangement.Bottom,
    horizontalAlignment = Alignment.CenterHorizontally) {
        Text("From", fontSize = 18.sp, fontWeight = FontWeight.Bold)
        Row() {
            Icon(painterResource(R.drawable.meta), contentDescription = null,
                modifier = Modifier.size(24.dp), tint = colorResource(R.color.light_green)
            )
            Text("Meta", fontSize = 18.sp, fontWeight = FontWeight.Bold)
        }
    }
}