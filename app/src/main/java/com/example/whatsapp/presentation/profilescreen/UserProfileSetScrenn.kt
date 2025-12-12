package com.example.whatsapp.presentation.profilescreen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.NavHostController
import com.example.whatsapp.presentation.viewmodal.PhoneAuthViewModal


@Composable
fun userProfileSetScreen(phoneAuthViewModal: PhoneAuthViewModal,navHostController: NavHostController){
    var name by remember { mutableStateOf("") }
    var status by remember { mutableStateOf("") }

}