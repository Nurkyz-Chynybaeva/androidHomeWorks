package com.example.homeworks

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity(), OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initFragments()

        val btn1 = findViewById<AppCompatButton>(R.id.btnM1)
        btn1.setOnClickListener {
            val fragment1 = supportFragmentManager.findFragmentByTag("fragment1")
            val fragment2 = supportFragmentManager.findFragmentByTag("fragment2")
            supportFragmentManager.beginTransaction()
                .show(fragment1!!)
                .hide(fragment2!!)
                .commit()
        }

        val btn2 = findViewById<AppCompatButton>(R.id.btnM2)
        btn2.setOnClickListener {
            val fragment2 = supportFragmentManager.findFragmentByTag("fragment2")
            val fragment1 = supportFragmentManager.findFragmentByTag("fragment1")
            supportFragmentManager.beginTransaction()
                .show(fragment2!!)
                .hide(fragment1!!)
                .commit()
        }

        val btn3 = findViewById<AppCompatButton>(R.id.btnM3)
        btn3.setOnClickListener{
            startActivity(Intent(this, MainActivity2::class.java))
        }
    }

    private fun initFragments() {
        supportFragmentManager.beginTransaction()
            .add(R.id.container, Fragment1(), "fragment1")
            .addToBackStack(null)
            .commit()

        supportFragmentManager.beginTransaction()
            .add(R.id.container, Fragment2(), "fragment2")
            .addToBackStack(null)
            .commit()
    }

    override fun onClicked(message: String) {
        // ---
    }


}