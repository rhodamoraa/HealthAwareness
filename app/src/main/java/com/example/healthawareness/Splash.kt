package com.example.healthawareness

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //to handle the waiting
        Handler().postDelayed(Runnable {
            val i=Intent(this,MainActivity::class.java)
            startActivity(i)

        },5000);//5 seconds
    }
}