package com.example.sample_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent

class GestureEvent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gesture_event)



    }
}


class GestrueSample2 : GestureDetector.OnGestureListener{
    // 제스처 이벤트를 받아서 text를 변경
    override fun onShowPress(e: MotionEvent?) {
        text2.text = "안녕"
        text3.text = "반갑습니다."
        Log.d("test1","onShowPress")
        Log.d("test1",e.toString())
    }

}

class gsSample : GestureDetector.OnGestureListener{
    override fun onShowPress(e: MotionEvent?) {
        TODO("Not yet implemented")
        text2.text = "gd"
    }
}

class MyGesture2 : GestureDetector.OnGestureListener {

    // 제스처 이벤트를 받아서 text를 변경
    override fun onShowPress(e: MotionEvent?) {
        text2.text = "안녕"
        text3.text = "반갑습니다."
        Log.d("test1","onShowPress")
        Log.d("test1",e.toString())
    }
    override fun onSingleTapUp(e: MotionEvent?): Boolean {

        Log.d("test1","onSingleTapUp")
        Log.d("test1",e.toString())
        return true
    }
    override fun onDown(e: MotionEvent?): Boolean {

        Log.d("test1","onDown")
        Log.d("test1",e.toString())
        return true
    }
    override fun onFling(e1: MotionEvent?, e2: MotionEvent?, velocityX: Float, velocityY: Float): Boolean {

        Log.d("test1","onFling")
        Log.d("test1",e1.toString() + e2.toString())
        return true
    }
    override fun onScroll(e1: MotionEvent?, e2: MotionEvent?, distanceX: Float, distanceY: Float): Boolean {

        Log.d("test1","onScroll")
        Log.d("test1",e1.toString() + e2.toString())
        return true
    }
    override fun onLongPress(e: MotionEvent?) {

        Log.d("test1","onLongPress")
        Log.d("test1",e.toString())
    }

}