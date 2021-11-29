package com.example.homeworks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.widget.AppCompatTextView

class MainActivity : AppCompatActivity() {
    private lateinit var text: AppCompatTextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = findViewById<TextView>(R.id.txt)
        val button1 = findViewById<Button>(R.id.btn1)
        val button2 = findViewById<Button>(R.id.btn2)

        var count = 0
        button1.setOnClickListener {
            ++count
            text.text = count.toString()
        }
        button2.setOnClickListener {
            if (text.text != "0") {
                text.text = "0"
                count = 0
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState?.run {
            putString("count", text.toString()) // крашится, когда поворачиваю экран
        }
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        text.text = savedInstanceState.getString("count")
    }
}
