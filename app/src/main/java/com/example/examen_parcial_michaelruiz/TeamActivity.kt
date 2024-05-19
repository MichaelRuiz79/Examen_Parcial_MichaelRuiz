package com.example.examen_parcial_michaelruiz

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TeamActivity : AppCompatActivity() {
    private val teams = arrayOf("Argentina", "Brasil", "Uruguay", "Colombia", "Estados Unidos"
    ,"Peru","Canada","Mexico","Trinidad y Tobago")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_teams)
        val lvTeams: ListView = findViewById(R.id.lvTeams)
        val btnGoToMenu: Button = findViewById(R.id.btnGoToMenu)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, teams)
        lvTeams.adapter = adapter

        btnGoToMenu.setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
        }
    }
}