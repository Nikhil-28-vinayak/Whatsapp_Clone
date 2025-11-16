package com.example.whatsapp.presentation.callscreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
fun CallScreen() {
    var callList=listOf<Call>(
        Call(
            image = R.drawable.akshay_kumar,
            name = "Akshay Kumar",
            time =  "Today, 5:00 PM",
            isMissed = false
        ),
        Call(
            image = R.drawable.tripti_dimri,
            name = "Tripti Dimri",
            time =  "Today, 10:00 AM",
            isMissed = true
        ),
        Call(
            image = R.drawable.kartik_aaryan,
            name = "Kartik Aryan",
            time =  "Yesterday, 3:42 PM",
            isMissed = false
        ),
        Call(
            image = R.drawable.hrithik_roshan,
            name = "Hritik Roshan",
            time =  "Yesterday, 3:30 PM",
            isMissed = true
        ),
        Call(
            image = R.drawable.sharadha_kapoor,
            name = "Sharadha Kapoor",
            time =  "Yesterday, 11:00 AM",
            isMissed = false
        ),
        Call(
            image = R.drawable.ajay_devgn,
            name = "Ajay Devgan",
            time =  "Tuesday, 7:03 PM",
            isMissed = false
        ),
        Call(
            image = R.drawable.tripti_dimri,
            name = "Tripti Dimri",
            time =  "Tuesday, 4:13 PM",
            isMissed = false
        ),
    )
    var isSearching by remember { mutableStateOf(false) }
    var search by remember { mutableStateOf("") }
    var showMenu by remember { mutableStateOf(false) }
    Scaffold(topBar = {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(WindowInsets.statusBars.asPaddingValues())
        ) {
            Column {
                Row {
                    if (isSearching) {
                        TextField(
                            value = search,
                            onValueChange = { search = it },
                            placeholder = { Text("Search") },
                            colors = TextFieldDefaults.colors(
                                unfocusedContainerColor = Color.Transparent,
                                focusedContainerColor = Color.Transparent,
                                unfocusedIndicatorColor = Color.Transparent,
                                focusedIndicatorColor = Color.Transparent
                            ),
                            singleLine = true,
                            modifier = Modifier.padding(start = 12.dp)
                        )
                    } else {
                        Text(
                            "Calls",
                            fontSize = 28.sp,
                            modifier = Modifier.padding(start = 12.dp, top = 4.dp)
                        )
                    }

                    Spacer(modifier = Modifier.weight(1f))

                    if (isSearching) {
                        IconButton(onClick = {
                            isSearching = false
                            search = ""
                        }) {
                            Icon(
                                painter = painterResource(R.drawable.cross),
                                contentDescription = null,
                                modifier = Modifier.padding(15.dp)
                            )
                        }
                    } else {
                        IconButton(onClick = {
                            isSearching = true
                        }) {
                            Icon(
                                painter = painterResource(R.drawable.search),
                                contentDescription = null,
                                modifier = Modifier.size(24.dp)
                            )
                        }
                        IconButton(onClick = { showMenu = true }) {
                            Icon(
                                painter = painterResource(R.drawable.more),
                                contentDescription = null,
                                modifier = Modifier.size(24.dp)
                            )
                            DropdownMenu(
                                expanded = showMenu,
                                onDismissRequest = { showMenu = false }
                            ) {
                                DropdownMenuItem(
                                    text = { Text("Setting") },
                                    onClick = { showMenu = false }
                                )
                            }
                        }
                    }
                }
                HorizontalDivider()
            }
        }
    }, bottomBar = {
        BottomNavigation()
    }) {
        Column(modifier = Modifier.padding(it)) {
            Spacer(modifier = Modifier.height(16.dp))
            FavouriteSection()
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(R.color.light_green)),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Text(
                    "Start a new call",
                    color = Color.White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                "Recent Calls",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            )
            LazyColumn {
                items(callList) {data ->
                     CallItemDesign(call = data)
                }
            }
        }
    }
}