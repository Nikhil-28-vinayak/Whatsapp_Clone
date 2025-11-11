package com.example.whatsapp.presentation.updatescreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.whatsapp.R
import com.example.whatsapp.presentation.bottomnavigation.BottomNavigation

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun UpdateScreen() {
    Scaffold(floatingActionButton = {
        FloatingActionButton(
            onClick = {},
            containerColor = colorResource((R.color.light_green)),
            modifier = Modifier.size(65.dp),
            contentColor = Color.White
        ) {
            Icon(painter = painterResource(R.drawable.basline_camera), contentDescription = null)
        }
    }, bottomBar = {
        BottomNavigation()
    }, topBar = {
        TopAppBar()
    }) {
        Column(modifier = Modifier.padding(it)) {

        }
    }
}