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

        Toast.makeText(this ,"answer : " + answer, Toast.LENGTH_SHORT).show()
    }


    fun collatzClick(view: View){
        var num = 16
        var answer: Int = 0
        var count = num.toLong()

        while(count != 1.toLong()){
            count = if(count%2 == 0.toLong()){
                count/2
            }else{
                count*3+1
            }
            answer++

            if(answer == 500){
                return Toast.makeText(this ,"answer : -" + 1, Toast.LENGTH_SHORT).show()
            }
        }

        Toast.makeText(this ,"answer : " + answer, Toast.LENGTH_SHORT).show()
    }
}