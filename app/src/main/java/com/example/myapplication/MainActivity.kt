package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button15.setOnClickListener {
            calculateTip(0.15)
        }
        binding.button20.setOnClickListener {
            calculateTip(0.20)
        }
        binding.button25.setOnClickListener {
            calculateTip(0.25)
        }
    }

    private fun calculateTip(tipPer: Double){
        val baseAmount = binding.baseText.text.toString().toDoubleOrNull() ?: return
        val tip = baseAmount * tipPer
        val amount = baseAmount + tip
        binding.totalAmountTextView.text = String.format("$%.2f", amount)

    }
}