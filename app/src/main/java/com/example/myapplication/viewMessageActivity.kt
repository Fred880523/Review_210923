package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_view_message.*

class viewMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_message)

        //화면에 들어올떄 첨부된 데이터를 꺼내서 > 변수에 저장

        val receivedMessage = intent.getStringExtra("inputMessage")


        //messageTxt의 text속성에 저장해준 내용을 대입

        messageTxt.text = receivedMessage

        val num = intent.getIntExtra("number", 0)

        numberTxt.text = num.toString()

    }
}