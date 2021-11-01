package com.example.sample_app

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_calculator.*

class Calculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
    }

    var calcNum : Int = 0;
    var calcFlag : Int = 0;

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
        if(calcFlag == 0){
            resultView.append(num)
            Log.d("KDCKDC1", "calcFlag : 0")
        }else {
            resultView.setText("")
            resultView.append(num)
            calcFlag = 0
            Log.d("KDCKDC2", "calcFlag : 1")
        }
    }

    //연산기호버튼
    private fun btnOperatorClicked(symbol: String){

        var rv1 = Integer.parseInt(resultView.text.toString())
        calcFlag = 1

        if(resultView2.text != ""){
            var rv2Text = resultView2.text.toString()
            var rv2Num = rv2Text.substring(0, rv2Text.length-1)
            calcNum = Integer.parseInt(rv2Num)
            Log.d("KDCKDC3", calcFlag.toString() )

            resultView.setText((calcNum +rv1).toString())
            resultView2.setText(resultView.text.toString() + symbol)
            calcNum = 0
        }else{
            resultView2.setText(resultView.text.toString() + symbol)
            resultView.setText("")
        }
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




