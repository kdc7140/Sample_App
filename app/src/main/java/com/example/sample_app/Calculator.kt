package com.example.sample_app

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Calculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
    }

    fun buttonClicked(v: View) {
        when (v.id) {
            R.id.button00 -> btnNumClick("0")
            R.id.button01 -> btnNumClick("1")
            R.id.button02 -> btnNumClick("2")
            R.id.button03 -> btnNumClick("3")
            R.id.button04 -> btnNumClick("4")
            R.id.button05 -> btnNumClick("5")
            R.id.button06 -> btnNumClick("6")
            R.id.button07 -> btnNumClick("7")
            R.id.button08 -> btnNumClick("8")
            R.id.button09 -> btnNumClick("9")

            R.id.btnPlus -> btnOperatorClicked("+")
            R.id.btnMinus -> btnOperatorClicked("-")
            R.id.btnX -> btnOperatorClicked("X")
            R.id.btnDiv -> btnOperatorClicked("/")

            R.id.btnEqual -> btnResult()

            R.id.button13 -> viewReset()
        }
    }

    //숫자버튼
    private fun btnNumClick(num: String){
        findViewById<TextView>(R.id.resultView).append(num)
    }

    //연산기호버튼
    private fun btnOperatorClicked(symbol: String){

    }

    //초기화 버튼
    private fun viewReset(){
        findViewById<TextView>(R.id.resultView).apply {
            text = "";
        }
    }

    //계산
    private fun btnResult(){

    }
}




