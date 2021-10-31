package com.example.homeworks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickEvent(view: View){
      val msg = when(view.id){
            R.id.btn1 -> "first"
            R.id.btn2 -> "second"
            R.id.btn3 -> "third"
          else -> "unknown"
        }

        val txtView = findViewById<TextView>(R.id.textView)
        txtView.text= msg
//        txtView.text="click"
    }
}