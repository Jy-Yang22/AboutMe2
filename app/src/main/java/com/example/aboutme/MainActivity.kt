package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDone : Button = findViewById(R.id.btnDone)
        val tfNickName : TextView = findViewById(R.id.tfNickName)
        val tvNickName : TextView = findViewById(R.id.tvNickname)

        btnDone.setOnClickListener(){
            tvNickName.text = tfNickName.text


            btnDone.visibility = View.GONE
            tfNickName.visibility = View.GONE
            tvNickName.visibility = View.VISIBLE

            //hide keyboard
            val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(it.windowToken, 0)

        }
        tvNickName.setOnClickListener(){
            btnDone.visibility = View.VISIBLE
            tfNickName.visibility = View.VISIBLE
            tvNickName.visibility = View.GONE
            tfNickName.requestFocus()

            //show keyboard
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.showSoftInput(tfNickName, 0)
        }
    }
}