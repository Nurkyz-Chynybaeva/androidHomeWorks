package com.example.homeworks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    private lateinit var layout: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        layout = findViewById(R.id.layout)

        val btn1 = findViewById<AppCompatButton>(R.id.btn1)
        val btn2 = findViewById<AppCompatButton>(R.id.btn2)
        val btn3 = findViewById<AppCompatButton>(R.id.btn3)

        btn1.setOnClickListener {
            textView.text = "red"
            layout.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_red_dark))
        }
        btn2.setOnClickListener {
            textView.text = "yellow"
            layout.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_orange_light))
        }
        btn3.setOnClickListener {
            textView.text = "green"
            layout.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_dark))
        }
    }
}
