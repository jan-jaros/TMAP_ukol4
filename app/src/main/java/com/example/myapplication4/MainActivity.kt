package com.example.myapplication4

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast
import android.content.Intent
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun magicClick(view: View) {
        Toast.makeText(this, "Kliknuto na tlacitko",
            Toast.LENGTH_LONG).show()
        Log.i("info", "Uzivatel kliknul na tlacitko")
    }

    fun loadFinalScene(view: View){
        val nameTextBox =findViewById<TextInputEditText>(R.id.jmenoID)
        val birthdayTextBox =findViewById<TextInputEditText>(R.id.narozeniID)

        val nameValue =nameTextBox.text.toString()
        val birthdayValue =birthdayTextBox.text.toString()

        val intent = Intent(this, FormDetails::class.java).apply {
            putExtra("Jmeno", nameValue)
            putExtra("Narozeni", birthdayValue)
        }
        startActivity(intent)
    }

    fun loadFormScene(view: View){
        setContentView(R.layout.formular)
    }
}

/*Medium Phone API 30 is already running. If that is not the case, delete C:\Program Files\android-sdk\.android\avd\Medium_Phone_API_30.avd\*.lock and try again.*/