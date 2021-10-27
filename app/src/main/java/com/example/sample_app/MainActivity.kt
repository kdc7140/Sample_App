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

        val button : Button = findViewById(R.id.button3)
        button.setOnClickListener{
            solution()
        }

        var moveToCalc : Button = findViewById(R.id.btnCalc)
        moveToCalc.setOnClickListener{
            val calcIntent = Intent(this, Calculator::class.java)
            startActivity(calcIntent)
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


    fun solution() {
        Log.d("KDC", "start")
        var editCt = findViewById<EditText>(R.id.editCt)
        var answer:Int = 0
        var count = Integer.parseInt(editCt.text.toString()).toLong()


        while(count != 1.toLong()){
            count = if(count%2 == 0.toLong()){
                count/2
            }else{
                count*3+1
            }
            answer++

            if(answer == 500){
                answer = -1
            }
        }

        var textView2 = findViewById<TextView>(R.id.textView2).apply{
            text = answer.toString()
        }

        //return answer
    }
}