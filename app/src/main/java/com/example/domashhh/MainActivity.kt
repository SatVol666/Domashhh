package com.example.domashhh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sharedPreferences = getSharedPreferences("kkk", MODE_PRIVATE)

        val keyText: EditText = findViewById(R.id.keyText)

        val infoText: EditText = findViewById(R.id.infoText)

        val saveButton: Button = findViewById(R.id.saveButton)

        val inputKey: EditText = findViewById(R.id.inputKey)

        val inputButton: Button = findViewById(R.id.inputKeyButton)

        val textView: TextView = findViewById(R.id.textView)

        saveButton.setOnClickListener{
            sharedPreferences.edit().putString(keyText.text.toString(),infoText.text.toString()).apply()
        }
        inputButton.setOnClickListener{
            textView.text  = sharedPreferences.getString(inputKey.text.toString(), "Fuck")
        }
    }
}