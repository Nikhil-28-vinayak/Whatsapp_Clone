package com.example.whatsapp.presentation.homescreen


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
@Preview(showSystemUi = true, showBackground = true)
fun HomeScreen() {
    var chatData = listOf(
        ChatDesignModal(
            image = R.drawable.salman_khan,
            name = "Salman Khan",
            time = "10:00AM",
            message = "Hello How are you"
        ),
        ChatDesignModal(
            image = R.drawable.sharukh_khan,
            name = "Sharukh Khan",
            time = "12:00PM",
            message = "Are you free?"
        ),
        ChatDesignModal(
            image = R.drawable.rashmika,
            name = "Rashmika",
            time = "1:00PM",
            message = "Hello"
        ),
        ChatDesignModal(
            image = R.drawable.sharadha_kapoor,
            name = "Sharadha Kapoor",
            time = "5:00PM",
            message = "Can you send me my picture!"
        ),
        ChatDesignModal(
            image = R.drawable.tripti_dimri,
            name = "Tripti Dimri",
            time = "3:30PM",
            message = "can you help me?"
        ),
        ChatDesignModal(
            image = R.drawable.kartik_aaryan,
            name = "Kartik Aryan",
            time = "5:10PM",
            message = "Bro Where are you?"
        ),
        ChatDesignModal(
            image = R.drawable.hrithik_roshan,
            name = "Hrithik Roshan",
            time = "5:10PM",
            message = "hello brother!"
        ),
        ChatDesignModal(
            image = R.drawable.disha_patani,
            name = "Disha Patani",
            time = "3:00PM",
            message = "Hi!"
        ),
        ChatDesignModal(
            image = R.drawable.bhuvan_bam,
            name = "Bhuvan Bam",
            time = "8:45AM",
            message = "Bother can we meet?"
        ),
        ChatDesignModal(
            image = R.drawable.ajay_devgn,
            name = "Ajay Devan",
            time = "11:55AM",
            message = "Can we talk!"
        ),
    )
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = { TODO("wait") },
                containerColor = colorResource(R.color.light_green),
                modifier = Modifier.size(65.dp)
            ) {
                Icon(
                    painterResource(R.drawable.chat_icon),
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier.size(28.dp)
                )
            }
        }, bottomBar = {
            BottomNavigation()
        }
    ) {
        Column(modifier = Modifier.padding(it)) {
            Spacer(modifier = Modifier.height(16.dp))
            Box(modifier = Modifier.fillMaxWidth()) {
                Text(
                    "Whatsapp",
                    fontSize = 28.sp,
                    color = colorResource(R.color.light_green),
                    modifier = Modifier
                        .align(
                            Alignment.CenterStart
                        )
                        .padding(start = 16.dp),
                    fontWeight = FontWeight.Bold
                )
                Row(modifier = Modifier.align(Alignment.CenterEnd)) {
                    IconButton(onClick = {}) {
                        Icon(
                            painterResource(R.drawable.camera),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                    IconButton(onClick = {}) {
                        Icon(
                            painterResource(R.drawable.search),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                    IconButton(onClick = {}) {
                        Icon(
                            painterResource(R.drawable.more),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                }
            }
            HorizontalDivider()
            LazyColumn() {
                items(chatData){
                    ChatDesign(chatDesignModal = it)
                }
            }
        }
    }
}