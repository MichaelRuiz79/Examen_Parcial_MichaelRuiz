package com.example.examen_parcial_michaelruiz

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        findViewById<Button>(R.id.btn_menu1).setOnClickListener {
            startActivity(Intent(this,PrizesActivity:: class.java))
        }
        findViewById<Button>(R.id.btnMenu2).setOnClickListener {
            startActivity(Intent(this, TeamActivity:: class.java))
        }
        findViewById<Button>(R.id.btnMenu3).setOnClickListener {
            startActivity(Intent(this, StadiumsActivity:: class.java))
        }
        }
    }