package com.example.whatsapp.presentation.updatescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsapp.R

@Composable
fun MyStatus() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box() {
            Image(
                painter = painterResource(R.drawable.bhuvan_bam),
                contentDescription = null,
                modifier = Modifier
                    .size(60.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
            Icon(
                painterResource(R.drawable.baseline_add),
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier
                    .align(
                        Alignment.BottomEnd
                    )
                    .padding(2.dp)
                    .background(
                        colorResource(R.color.light_green),
                        shape = RoundedCornerShape(12.dp)
                    )
            )
        }
        Spacer(modifier = Modifier.width(12.dp))
        Column {
            Text("My Status", fontWeight = FontWeight.Bold, fontSize = 16.sp)
            Text("Tap to add status update", color = Color.Gray, fontSize = 14.sp)
        }
    }
}

data class Statusdata(
    val image: Int,
    val name: String,
    val time: String
)

@Composable
fun StatusItem(statusdata: Statusdata) {
    Row(
        modifier = Modifier
            .padding(horizontal = 12.dp, vertical = 8.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painterResource(statusdata.image),
            contentDescription = null,
            modifier = Modifier
                .size(60.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.width(12.dp))
        Column {
            Text(statusdata.name, fontSize = 16.sp, fontWeight = FontWeight.Bold)
            Text(statusdata.time, fontSize = 14.sp, color = Color.Gray)
        }
    }
}
