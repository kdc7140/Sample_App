package com.example.sample_app

import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.sample_app.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_kotlin_event.*

class KotlinEvent : AppCompatActivity() {

    private var mBinding: ActivityMainBinding? = null
    // 매번 null 체크를 할 필요 없이 편의성을 위해 바인딩 변수 재 선언
    private val binding get() = mBinding!!



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_kotlin_event)

        setContentView(binding.root)

        val view = findViewById<View>(R.id.view1)
        view.setOnTouchListener { view, motionEvent ->
            val state = motionEvent.action
            val x = motionEvent.x
            val y = motionEvent.y
            if (state == MotionEvent.ACTION_DOWN) {
                println("손가락 눌림 : $x, $y")
                textView1.setText("손가락 눌림 : $x, $y")
            } else if (state == MotionEvent.ACTION_MOVE) {
                println("손가락 움직임 : $x, $y")
                textView2.setText("손가락 움직임 : $x, $y")
            } else if (state == MotionEvent.ACTION_UP) {
                println("손가락 땜 : $x, $y")
                textView3.setText("손가락 땜 : $x, $y")
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

