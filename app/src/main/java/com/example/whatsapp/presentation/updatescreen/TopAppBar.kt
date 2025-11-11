package com.example.whatsapp.presentation.updatescreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import com.example.whatsapp.R
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun TopAppBar() {
    var isSearching by remember { mutableStateOf(false) }
    var search by remember { mutableStateOf("") }
    Box(modifier = Modifier.fillMaxWidth()) {
        Column {
            Row() {
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
                        ), singleLine = true, modifier = Modifier.padding(start = 12.dp)
                    )
                } else {
                    Text(
                        "Updates",
                        fontSize = 28.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(start = 12.dp, top = 4.dp)
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
                if (isSearching) {
                    IconButton(onClick = { isSearching = false
                        search=""}) {
                        Icon(
                            painter = painterResource(R.drawable.cross),
                            contentDescription = null,
                            modifier = Modifier.padding(15.dp)
                        )
                    }
                } else {
                    IconButton(onClick = {}) {
                        Icon(
                            painterResource(R.drawable.camera),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                    IconButton(onClick = {
                        isSearching = true
                    }) {
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
        }
    }
}