package com.svk.firstwork

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    var button4: Button? = null
    var button5: Button? = null
    var text: TextView? = null
    var editText: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        initViews1()
        click4()
        click5()
    }

    private fun initViews1() {
        if (button4 == null)
            button4 = findViewById(R.id.button4)
        if (button5 == null)
            button5 = findViewById(R.id.button5)
        if (text == null)
            text = findViewById(R.id.textView)
        if (editText == null)
            editText = findViewById(R.id.editTextTextPersonName2)
    }

    private fun click4() {
        button4?.setOnClickListener {
            
            text?.text = editText?.getText().toString()
        }
    }

    private fun click5() {
        button5?.setOnClickListener {
            val action5 = Intent(this, ThirdActivity::class.java)
            startActivity(action5)
        }
    }
}