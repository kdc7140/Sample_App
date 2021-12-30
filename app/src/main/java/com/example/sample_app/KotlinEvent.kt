package com.example.sample_app

import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.View
import kotlinx.android.synthetic.main.activity_kotlin_event.*
import androidx.appcompat.app.AppCompatActivity

class KotlinEvent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_event)

        val view = findViewById<View>(R.id.view1)
        view.setOnTouchListener { view, motionEvent ->
            val state = motionEvent.action
            val x = motionEvent.x
            val y = motionEvent.y
            if (state == MotionEvent.ACTION_DOWN) {
                println("손가락 눌림 : $x, $y")
            } else if (state == MotionEvent.ACTION_MOVE) {
                println("손가락 움직임 : $x, $y")
            } else if (state == MotionEvent.ACTION_UP) {
                println("손가락 땜 : $x, $y")
            }
            true
        }



    }

}

fun println(data: String) {
    var a = StringBuilder()
    a.append(data)
    Log.d("location", data)
}

