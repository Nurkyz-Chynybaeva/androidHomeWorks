package com.example.homeworks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity(){                                  //..., View.OnClickListener

       private lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.card_view)

//        TextView = findViewById<TextView>(R.id.textView)
//        val btn1 = findViewById<AppCompatButton>(R.id.btn1)
//        val btn2 = findViewById<AppCompatButton>(R.id.btn2)
//        val btn3 = findViewById<AppCompatButton>(R.id.btn3)
//
//
//    btn1.setOnClickListener{
//        TextView.text = "first click"
//        Toast.makeText(this, "f click" , Toast.LENGTH_LONG).show()
//    }
//        btn2.setOnClickListener{
//            TextView.text = "second click"
//            Toast.makeText(this, "s click" , Toast.LENGTH_LONG).show()
//        }
//      btn3.setOnClickListener{
//            TextView.text = "third click"
//            Toast.makeText(this, "t click" , Toast.LENGTH_LONG).show()
//        }

}











//        val btn1 = findViewById<AppCompatButton>(R.id.btn1)                                   java style
//        val btn2 = findViewById<AppCompatButton>(R.id.btn2)
//        val btn3 = findViewById<AppCompatButton>(R.id.btn3)
//        btn1.setOnClickListener(this)
//        btn2.setOnClickListener(this)
//        btn3.setOnClickListener(this)


//    override fun onClick(view: View) {                                                        java style
//      val msg = when(view.id){
//            R.id.btn1 -> "first"
//            R.id.btn2 -> "second"
//            R.id.btn3 -> "third"
//          else -> "unknown"
//        }
//        val txtView = findViewById<TextView>(R.id.textView)
//        txtView.text= msg
//    }

//    fun onClickEvent(view: View){                                        старый способ
//      val msg = when(view.id){
//            R.id.btn1 -> "first"
//            R.id.btn2 -> "second"
//            R.id.btn3 -> "third"
//          else -> "unknown"
//        }
//
//        val txtView = findViewById<TextView>(R.id.textView)
//        txtView.text= msg
//      txtView.text="click"
//    }
}