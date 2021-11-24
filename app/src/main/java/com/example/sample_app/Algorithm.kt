package com.example.sample_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import java.util.*

class Algorithm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_algorithm)
    }

    fun greedyClick(view: View){
        val n : Int = 5
        var lost : Array<Int> = arrayOf(2,4)
        var reserve : Array<Int> = arrayOf(1,3,5)

        for(item in reserve){
            if(lost.indexOf(item-1) !=1){
                Log.d("KDC test", (item-1).toString())
                lost.slice(IntRange(lost.indexOf(item-1), lost.indexOf(item-1)+1))

            }
        }
        Log.d("KDC test2", "success")

        var answer = n
        var lostSet = lost.toSet() - reserve.toSet()
        var reserveSet = (reserve.toSet() - lost.toSet()) as MutableSet

        for (item in lostSet) {
            when {
                item - 1 in reserveSet -> reserveSet.remove(item - 1)
                item + 1 in reserveSet -> reserveSet.remove(item + 1)
                else -> answer--
            }
        }

        //Toast.makeText(applicationContext ,"answer : " + answer.toString())
    }
}