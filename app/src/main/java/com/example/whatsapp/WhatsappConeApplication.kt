package com.example.whatsapp


import android.app.Application
import com.google.firebase.FirebaseApp // <-- Import this
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class WhatsappCloneApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        FirebaseApp.initializeApp(this)
    }
}