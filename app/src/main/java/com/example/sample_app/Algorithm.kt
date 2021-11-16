package com.example.sample_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import java.util.*

class Algorithm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_algorithm)
    }

    fun greedyClick(view: View): Int {
        val n : Int = 5
        var lost : Array<Int> = arrayOf(2,4)
        var reserve : Array<Int> = arrayOf(1,3,5)

        for(item in reserve){
            if(lost.indexOf(item) != -1){
                lost.slice(IntRange(lost.indexOf(item), lost.indexOf(item)+1))
            }else if(lost.indexOf(item-1) != -1){
                lost.slice(IntRange(lost.indexOf(item-1), lost.indexOf(item-1)+1))
            }else if(lost.indexOf(item+1) != -1){
                lost.slice(IntRange(lost.indexOf(item+1), lost.indexOf(item+1)+1))
            }
        }

        return n - lost.size

        Log.d("KDC Array", Arrays.toString(lost))
        Log.d("KDC Array", Arrays.toString(reserve))
    }
}