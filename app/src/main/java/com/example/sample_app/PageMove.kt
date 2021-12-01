package com.example.sample_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class PageMove : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_move)


        var btnPageMove : Button = findViewById(R.id.btnPageMove)
        btnPageMove.setOnClickListener{
            var param = findViewById<TextView>(R.id.textParam).text

            val calcIntent = Intent(this, Calculator::class.java)
            startActivity(calcIntent, movePage)
        }
    }

}