package com.svk.firstwork

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var square1: View? = null
    var button1: Button? = null
    var button2: Button? = null
    var button3: Button? = null
    val colors = arrayOf(
        Color.parseColor("#FF6200EE"),
        Color.parseColor("#CC0000"),
        Color.parseColor("#33CC33"),
        Color.parseColor("#FFFF00"),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        click1()
        click2()
        click3()
    }

    private fun initView() {
        if (button1 == null)
            button1 = findViewById(R.id.button1)
        if (button2 == null)
            button2 = findViewById(R.id.button2)
        if (button3 == null)
            button3 = findViewById(R.id.button3)
        if (square1 == null)
            square1 = findViewById(R.id.view)
    }

    private fun click1() {
        button1?.setOnClickListener {
            val randomColor = colors.random()
            square1?.setBackgroundColor(randomColor)
        }
    }
    private fun click2() {
        button2?.setOnClickListener {
            val action2 = Intent(this, SecondActivity::class.java)
            startActivity(action2)
        }
    }

    private fun click3() {
        button3?.setOnClickListener {
            val action3 = Intent(this, ThirdActivity::class.java)
            startActivity(action3)
        }
    }
}