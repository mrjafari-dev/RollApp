package com.dotdevstudio.rollapp

import android.annotation.SuppressLint
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var dice: ImageView
    lateinit var rollBtn: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dice = findViewById<ImageView>(R.id.dice)
        rollBtn = findViewById(R.id.rollBtn)
        rollBtn.setOnClickListener {
            setImage()
        }
    }



    fun setImage() {
        val dice = Dice(6)
        val diceNumber = dice.rollDice()
        when (diceNumber) {
            1 -> setImage(R.drawable.dice_1)
            2 -> setImage(R.drawable.dice_2)
            3 -> setImage(R.drawable.dice_3)
            4 -> setImage(R.drawable.dice_4)
            5 -> setImage(R.drawable.dice_5)
            6 -> setImage(R.drawable.dice_6)

        }
    }

    fun setImage(drawable: Int) {
        dice.setImageResource(drawable)
    }
}