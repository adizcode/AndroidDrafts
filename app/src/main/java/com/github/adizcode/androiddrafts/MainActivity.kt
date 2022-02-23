package com.github.adizcode.androiddrafts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.adizcode.androiddrafts.databinding.ActivityMainBinding
import kotlin.math.ceil

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.calculateButton.setOnClickListener { calculateTip() }
    }

    private fun calculateTip() {
        val costOfService = binding.costOfService.text.toString().toDoubleOrNull()

        val tipPercentage = when (binding.tipOptions.checkedRadioButtonId) {
            R.id.option_twenty_percent -> 20.0
            R.id.option_eighteen_percent -> 18.0
            else -> 15.0
        }

        var tip = costOfService ?: 0 * tipPercentage / 100
        if (binding.roundUpSwitch.isChecked) {
            tip = ceil(tip)
        }

        binding.tipAmount.text = tip.toString()
    }
}