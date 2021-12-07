package com.example.sample_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class PageMove : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_move)


        var btnPageMove : Button = findViewById(R.id.btnPageMove)
        btnPageMove.setOnClickListener{
//            var param = findViewById<TextView>(R.id.textParam).text
//

            val editText = findViewById<EditText>(R.id.textParam)
            val message = editText.text.toString()
            val intent = Intent(this, PageMove2::class.java).apply {
                putExtra(EXTRA_MESSAGE, message)
            }
            startActivityForResult(intent, 200)

        }

    }

}