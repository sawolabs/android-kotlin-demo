package com.sawolabs.kotlinsampleapp

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.sawolabs.androidsdk.LOGIN_SUCCESS_MESSAGE

class CallbackActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_callback)
        Toast.makeText(this, "Logged in successfully", Toast.LENGTH_SHORT).show()
        val intent = intent
        val message = intent.getStringExtra(LOGIN_SUCCESS_MESSAGE)
        Log.i("payload:", message!!)
    }
}