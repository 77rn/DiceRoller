package com.example.diceroller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class realgame : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_realgame)

        val Rollbutton = findViewById<CardView>(R.id.rollbut)

        Rollbutton.setOnClickListener {
            intent = Intent(applicationContext, gamepage::class.java)
            startActivity(intent)

        }
    }
}