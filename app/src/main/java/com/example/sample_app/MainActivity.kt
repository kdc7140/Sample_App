package com.example.sample_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.NumberFormatException

const val EXTRA_MESSAGE = "com.example.sample_app.MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var moveToCalc : Button = findViewById(R.id.btnCalc)
        moveToCalc.setOnClickListener{
            val calcIntent = Intent(this, Calculator::class.java)
            startActivity(calcIntent)
        }

        var moveToAlgo : Button = findViewById(R.id.btnAlgo)
        moveToAlgo.setOnClickListener{
            val algoIntent = Intent(this, Algorithm::class.java)
            startActivity(algoIntent)
        }
    }

    /** Called when the user taps the Send button */
    fun sendMessage(view: View) {
        val editText = findViewById<EditText>(R.id.editTextTextPersonName)
        val message = editText.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }

    fun msgTest(){
        Log.d("KDC", "test")
    }
}