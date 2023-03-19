package com.example.diceroller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        val topanim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        val bottomanim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        val image = findViewById<ImageView>(R.id.imageView)
        val text = findViewById<TextView>(R.id.textView)

        image.startAnimation(topanim)
        text.startAnimation(bottomanim)

        Handler().postDelayed({
            val intent = Intent(this,realgame::class.java)
            startActivity(intent)
            finish()
        },3000)
    }
}