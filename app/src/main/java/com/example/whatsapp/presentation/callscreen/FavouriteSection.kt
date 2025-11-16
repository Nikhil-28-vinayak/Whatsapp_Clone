package com.example.whatsapp.presentation.callscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsapp.R

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun FavouriteSection() {
    var sampleFavourite=listOf<FavouriteContact>(
        FavouriteContact(
            image = R.drawable.salman_khan,
            name = "Salman Khan"
        ),
        FavouriteContact(
            image = R.drawable.sharadha_kapoor,
            name = "Sharadha Kapoor"
        ),
        FavouriteContact(
            image = R.drawable.tripti_dimri,
            name = "Tripti dimri"
        ),
        FavouriteContact(
            image = R.drawable.sharukh_khan,
            name = "Sharukh khan"
        ),
        FavouriteContact(
            image = R.drawable.rashmika,
            name = "Rashmika"
        ),
        FavouriteContact(
            image = R.drawable.bhuvan_bam,
            name = "Bhuvan Ban"
        ),
    )
    Column(modifier = Modifier.padding(start = 16.dp, bottom = 8.dp)) {
        Text(
            "Favourites",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 8.dp)
        )
        LazyRow(modifier = Modifier.fillMaxWidth()) {
                items(sampleFavourite) {
                     FavouriteItem(favouriteContact = it)
                }
        }
    }
}
data class FavouriteContact(
        var image:Int,
        var name:String
        )