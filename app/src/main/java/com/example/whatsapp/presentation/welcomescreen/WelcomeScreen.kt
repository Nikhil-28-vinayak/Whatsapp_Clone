package com.example.whatsapp.presentation.welcomescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.whatsapp.R
import com.example.whatsapp.presentation.navigation.Routes

@Composable
fun WelcomeScreen(navController: NavController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(R.drawable.download),
            contentDescription = null,
            modifier = Modifier
                .size(220.dp)          // smaller & more responsive
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            "Welcome to Whatsapp",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(16.dp))
        Row() {
            Text("Read our", color = Color.Gray)
            Spacer(modifier = Modifier.width(8.dp))

            Text("Privacy Policy", color = colorResource(R.color.light_green))

            Spacer(modifier = Modifier.width(8.dp))
            Text("Tap Agree and", color = Color.Gray)
        }
        Row() {
            Text("continue to accept the", color = Color.Gray)
            Spacer(
                modifier =
                    Modifier.width(8.dp)
            )
            Text("Terms of Services", color = colorResource(R.color.light_green))
        }
        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = { navController.navigate(Routes.RegistrationScreen) },
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(colorResource(R.color.dark_green))
        ) {
            Text("Agree and Continue", fontSize = 16.sp, color = Color.White)
        }
    }
}
