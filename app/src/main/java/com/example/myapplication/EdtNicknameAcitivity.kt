package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edt_nickname_acitivity.*
import kotlinx.android.synthetic.main.activity_main.*

class EdtNicknameAcitivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edt_nickname_acitivity)

        okBtn.setOnClickListener {

            val inputNickname = nicknameEdt.text.toString()

            val resultIntent = Intent()

            resultIntent.putExtra("newNickname", inputNickname)

            setResult(RESULT_OK, resultIntent)

            finish()



        }


    }
}