package com.example.whatsapp.presentation.updatescreen

import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsapp.R
import com.example.whatsapp.presentation.bottomnavigation.BottomNavigation

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun UpdateScreen() {
    val scrollState = rememberScrollState()
    var statusList = listOf<Statusdata>(
        Statusdata(
            image = R.drawable.boy,
            name = "Salman Khan",
            time = "5:00 PM"
        ),
        Statusdata(
            image = R.drawable.girl,
            name = "Salman Khan",
            time = "5:00 PM"
        ),
        Statusdata(
            image = R.drawable.boy3,
            name = "Salman Khan",
            time = "5:00 PM"
        ),
        Statusdata(
            image = R.drawable.girl2,
            name = "Salman Khan",
            time = "5:00 PM"
        )

    )
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
        Column(
            modifier = Modifier
                .padding(it)
                .fillMaxSize()
                .verticalScroll(scrollState)
        ) {
            Text(
                "Status",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)
            )
            MyStatus()
            statusList.forEach {
                StatusItem(statusdata = it)

            }

        }
    }
}
