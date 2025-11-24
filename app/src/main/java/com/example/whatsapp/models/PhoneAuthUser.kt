package com.example.whatsapp.models

data class PhoneAuthUser(
    val userId:String="",
    val name:String="",
    val phoneNumber:String="",
    val status:String="",
    val profileImage:String?=null
)
