package com.example.sample_app

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_page_move2.*

class PageMove2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_move2)

        // Get the Intent that started this activity and extract the string
        val message = intent.getStringExtra(EXTRA_MESSAGE)
        revView.setText(message)
        // Capture the layout's TextView and set the string as its text
//        val textView = findViewById<TextView>(R.id.revView).apply {
//            text = message
//        }


        var btnSend : Button = findViewById(R.id.sendRev)
        btnSend.setOnClickListener {
            var rtText = revView.text.toString()

            var intent = Intent(this, PageMove::class.java)
            intent.putExtra("param", rtText)
            setResult(Activity.RESULT_OK, intent)
            finish()
        }
    }
}