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

    var calcNum : Int = 0           //계산된 값
    var calcFlag : Int = 0          //연산기호 클릭 flag
    var rstFlag : Int = 0           // '='클릭 flag
    var lastClickOp : Int = 0       //마지막누른 연산기호

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

            R.id.button11 -> btnPercent()

            R.id.btnEqual -> btnResult()

            R.id.button13 -> viewReset()
        }
    }

    //숫자버튼
    private fun btnNumClick(num: String){
        if(num == "0"){
            if(resultView.text.toString() == ""){
                return
            }
        }

        if(calcFlag == 0){
            resultView.append(num)
        }else {
            calcFlag = 0
            if(rstFlag == 0){
                resultView.setText("")
                resultView.append(num)
            }else{
                resultView.setText("")
                resultView2.setText("")
                resultView.append(num)
                rstFlag = 0
            }
        }
    }

    //연산기호버튼
    private fun btnOperatorClicked(symbol: String){

        calcFlag = 1

        var rv1 = Integer.parseInt(resultView.text.toString())

        if(resultView2.text.toString() != ""){
            var rv2Text = resultView2.text.toString()
            var rv2Num = rv2Text.substring(0, rv2Text.length-1)
            calcNum = Integer.parseInt(rv2Num)
            Log.d("KDCKDC3", calcFlag.toString() )

            when(symbol){
                "+" -> resultView.setText((calcNum + rv1).toString())
                "-" -> resultView.setText((calcNum - rv1).toString())
                "X" -> resultView.setText((calcNum * rv1).toString())
                "/" -> resultView.setText((calcNum / rv1).toString())
            }

            resultView2.setText(resultView.text.toString() + symbol)
            calcNum = 0
        }else{
            resultView2.setText(resultView.text.toString() + symbol)
            resultView.setText("")
        }
    }

    //% 버튼
    private fun btnPercent(){
        resultView.text.toString()
    }

    //초기화 버튼
    private fun viewReset(){
        resultView.setText("")
        resultView2.setText("")
    }


    //계산
    private fun btnResult(){

        var rv2Text = resultView2.text.toString()

        if(rv2Text == ""){
            resultView2.append(resultView.text.toString() + "=")
        }else{
            var rv2Num = rv2Text.substring(0, rv2Text.length-1)
            calcNum = Integer.parseInt(rv2Num)

            var rv1Num = Integer.parseInt(resultView.text.toString())

            val rstNum = calcNum + rv1Num

            resultView2.append(rv1Num.toString() + "=")

            resultView.setText(rstNum.toString())
        }

        calcFlag = 1
        rstFlag = 1

    }
}




