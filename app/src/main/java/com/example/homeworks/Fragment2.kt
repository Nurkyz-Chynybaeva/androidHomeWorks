package com.example.homeworks

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.Fragment

class Fragment2 : Fragment(R.layout.fragment2) {
    private lateinit var listener: OnButtonClicked
    private lateinit var text: AppCompatTextView

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as OnButtonClicked
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        text = view.findViewById(R.id.txt1F2)

        val button = view.findViewById<AppCompatButton>(R.id.btnF2)
        button.setOnClickListener {
            listener.onClick("message from the Fragment2")
        }
    }

    fun setText(message: String) {
        text.text = message
    }
}