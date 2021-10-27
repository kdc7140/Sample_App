package com.example.sample_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Calculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        var addZero : Button = findViewById(R.id.button22)
        addZero.setOnClickListener {
            var thisNum = findViewById<Button>(R.id.button22).text.toString()

            var textView = findViewById<TextView>(R.id.editTextTextPersonName2).apply {
                text = thisNum
            }
        }
    }
}