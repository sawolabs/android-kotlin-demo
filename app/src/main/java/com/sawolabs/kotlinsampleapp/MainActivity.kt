package com.sawolabs.kotlinsampleapp

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import com.sawolabs.androidsdk.Sawo

class MainActivity : AppCompatActivity() {
    var but: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val colorDrawable = ColorDrawable(Color.parseColor("#FFFFFF"))

        // Set BackgroundDrawable
        supportActionBar!!.setBackgroundDrawable(colorDrawable)
        supportActionBar!!.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
        supportActionBar!!.setCustomView(R.layout.title)
        but = findViewById(R.id.button9)
        but?.setOnClickListener {
            Sawo(
                this,
                "5c7b09f0-a8a8-4995-87ca-68db8704e00e",  // your api key,
                "61b84223d364bdfb9b049bd6ZrLVThXPyHRXp2aW6QTqANp4" // your api key secret
            ).login(
                "email",  // can be one of 'email' or 'phone_number_sms'
                CallbackActivity::class.java.name // Callback class name
            )
        }
    }
}