package com.example.homeworks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity2 : AppCompatActivity(), OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    override fun onClicked(message: String) {

        val fragment1 = supportFragmentManager.findFragmentById(R.id.firstContainer) as? Fragment1
        fragment1?.setText(message)

        val fragment2 = supportFragmentManager.findFragmentById(R.id.secondContainer) as? Fragment2
        fragment2?.setText(message)

    }
}