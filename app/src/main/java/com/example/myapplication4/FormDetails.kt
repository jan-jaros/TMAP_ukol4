package com.example.myapplication4

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FormDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.final_form)

        val nameText =intent.getStringExtra("Jmeno")
        val birthdayText =intent.getStringExtra("Narozeni")

        val nameTextView = findViewById<TextView>(R.id.printTextView)

        val result = "Jméno:\t$nameText \nNarození:\t$birthdayText"
        nameTextView.text = result
    }
}