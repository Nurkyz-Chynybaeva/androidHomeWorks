package com.example.homeworks

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.Fragment

class Fragment1: Fragment(R.layout.fragment1) {
    private lateinit var txt: AppCompatTextView
    private lateinit var listener: OnClickListener

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as OnClickListener
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        txt = view.findViewById(R.id.txtF1)
        val btnF1 = view.findViewById<AppCompatButton>(R.id.btnF1)
        btnF1.setOnClickListener {
            listener.onClicked("message from the first fragment")
        }
    }

    fun setText(value: String) {
        txt.text = value

    }
}