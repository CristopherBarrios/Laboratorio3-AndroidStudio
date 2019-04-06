package com.example.lab_3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var b: Button? = null
    private var textView: TextView? = null
    private var editText: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView) as TextView
        editText = findViewById(R.id.editText) as EditText
    }
    fun onClic(v: View?){
        textView?.visibility
       editText?.visibility
    }
}
