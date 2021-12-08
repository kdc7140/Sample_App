package com.example.sample_app

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.activity.result.contract.ActivityResultContracts

class PageMove : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_move)

        var getResult = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){ result ->

            if (result.resultCode == Activity.RESULT_OK) {
                val myData: Intent? = result.data
//                val stringData = myData.getStringExtra("dataName")
                //또는 이렇게
                val stringData2 = result.data?.getStringExtra("param")
                // 기타 등등 작업 수행
                Toast.makeText(this ,"answer : " + stringData2, Toast.LENGTH_SHORT).show()
            }
        }

        var btnPageMove : Button = findViewById(R.id.btnPageMove)
        btnPageMove.setOnClickListener{
//            var param = findViewById<TextView>(R.id.textParam).text
//

            val editText = findViewById<EditText>(R.id.textParam)
            val message = editText.text.toString()
            val intent = Intent(this, PageMove2::class.java).apply {
                putExtra(EXTRA_MESSAGE, message)
            }
            getResult.launch(intent)
//            startActivity(intent)

//            val intent = Intent(this, PageMove2::class.java)
//            getResult.launch(intent)
        }



    }



}