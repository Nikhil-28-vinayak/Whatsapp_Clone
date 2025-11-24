package com.example.whatsapp.presentation.viewmodal

import android.util.Log
import androidx.lifecycle.ViewModel
import com.google.firebase.FirebaseException
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.PhoneAuthCredential
import com.google.firebase.auth.PhoneAuthProvider
import com.google.firebase.database.FirebaseDatabase
import dagger.hilt.android.lifecycle.HiltViewModel
import jakarta.inject.Inject
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

@HiltViewModel
class PhoneAuthViewModal @Inject constructor(
    private val firebaseAuth: FirebaseAuth,
    private val firebaseDatabase: FirebaseDatabase
): ViewModel() {
      private val _authState= MutableStateFlow<AuthState>(AuthState.Ideal)
      val authState=_authState.asStateFlow()

    private val userRef=firebaseDatabase.reference.child("users")

    fun sendVerificationCode(phoneNumber: String,activity: String){
        _authState.value= AuthState.Loading
        val option = object: PhoneAuthProvider.OnVerificationStateChangedCallbacks(){

            override fun onCodeSent(id: String, token: PhoneAuthProvider.ForceResendingToken) {
                super.onCodeSent(id, token)
                Log.d("PhoneAuth","onCodeSent triggered. verification ID: ${id}")
                _authState.value= AuthState.CodeSent(id)
            }
            override fun onVerificationCompleted(credential: PhoneAuthCredential) {
                TODO("Not yet implemented")
            }

            override fun onVerificationFailed(exception:  FirebaseException) {
                Log.d("PhoneAuth","Verification failed: ${exception.message}")
                _authState.value= AuthState.Error(exception.message?:"Verification Failed")
            }

        }
    }
}

sealed class AuthState{
    object Ideal:AuthState()
    object Loading: AuthState()
    data class CodeSent(val verificationId:String): AuthState()
    data class Success(val user:String): AuthState()
    data class Error(val message:String):AuthState()
}