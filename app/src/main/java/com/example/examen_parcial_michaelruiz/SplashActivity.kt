package com.example.examen_parcial_michaelruiz

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    private val SPLASH_DISPLAY_TIME = 3000L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed({
            val mainIntent = Intent (this@SplashActivity, LoginActivity:: class.java)
            startActivity(mainIntent)
            finish()
        },SPLASH_DISPLAY_TIME)
        }
    }