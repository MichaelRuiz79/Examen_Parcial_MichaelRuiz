package com.example.examen_parcial_michaelruiz

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val emailEditText = findViewById<EditText>(R.id.TextEmail)
        val pswEditText = findViewById<EditText>(R.id.TextPassword)
        val btnLogin = findViewById<Button>(R.id.btnlogin)

        btnLogin.setOnClickListener {
            val email = emailEditText.text.toString()
            val psw = pswEditText.text.toString()

            if(email == "admin@americancup.com" && psw =="admin123"){
                val intent = Intent(this,MenuActivity::class.java)
                startActivity(intent)
            } else{
                Toast.makeText(this, "Correo o contraseña invalidos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}