package com.github.adizcode.androiddrafts

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var rollButton: Button
    private lateinit var diceOne: ImageView
    private lateinit var diceTwo: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
        rollButton.setOnClickListener { rollDices() }

        rollDices()
    }

    private fun initViews() {
        rollButton = findViewById(R.id.roll_button)
        diceOne = findViewById(R.id.dice_one)
        diceTwo = findViewById(R.id.dice_two)
    }

    private fun rollDices() = rollDiceViews(diceOne, diceTwo)
}