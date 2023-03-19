package com.example.diceroller

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class gamepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gamepage)

        val buttonRoll = findViewById<Button>(R.id.buttonRoll)
        val imageDice = findViewById<ImageView>(R.id.imageDice)
        val calling= findViewById<TextView>(R.id.problem)
        val welcomebutton= findViewById<Button>(R.id.buttonRoll)


        welcomebutton.setOnClickListener {
            Toast.makeText(applicationContext, "Rolled..", Toast.LENGTH_SHORT).show()
        }

        calling.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "9556148116")
            startActivity(intent)
        }

        buttonRoll.setOnClickListener {
            // Generate a random number between 1 and 6
            val randomNumber = Random.nextInt(1, 7)

            // Create an animation to roll the dice image
            val anim = AnimationUtils.loadAnimation(this, R.anim.rotate)
            imageDice.startAnimation(anim)

            // Delay the update of the dice image to match the animation duration
            Handler().postDelayed({
                // Set the new dice image based on the random number
                val drawableResource = when (randomNumber) {
                    1 -> R.drawable.dice1
                    2 -> R.drawable.dice2
                    3 -> R.drawable.dice3
                    4 -> R.drawable.dice4
                    5 -> R.drawable.dice5
                    else -> R.drawable.dice6
                }
                imageDice.setImageResource(drawableResource)
            }, anim.duration)
        //}
       // }
        }
    }
}
