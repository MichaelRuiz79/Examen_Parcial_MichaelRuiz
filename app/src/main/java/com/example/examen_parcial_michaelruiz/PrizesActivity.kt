package com.example.examen_parcial_michaelruiz

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class PrizesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_prizes)
        val etTotalAmount: EditText = findViewById(R.id.etamount)
        val btnCalculate: Button = findViewById(R.id.btncalculate)
        val tvPrizes: TextView = findViewById(
            R.id.txtviewprecios
        )


        btnCalculate.setOnClickListener {
            val totalAmount = etTotalAmount.text.toString().toDouble()
            val firstPlace = 0.25 * totalAmount
            val secondPlace = 0.15 * totalAmount
            val thirdPlace = 0.10 * totalAmount
            val fourthToSixteenth = (totalAmount - (firstPlace + secondPlace + thirdPlace)) / 13

            val prizesText = """
                1st place: $firstPlace USD
                2nd place: $secondPlace USD
                3rd place: $thirdPlace USD
                4th to 16th places: $fourthToSixteenth USD each
            """.trimIndent()

            tvPrizes.text = prizesText


        }
    }
}