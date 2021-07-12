package com.svk.myapplication22

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Activity2 : AppCompatActivity() {
    var button: Button?=null
    var etName: EditText? = null
    var etEmail: EditText? = null
    var etSurname: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        initVew()
        deleteData()
    }
    private fun initVew(){
        if (button == null)
            button = findViewById(R.id.button2act)
        if (etName == null)
            etName = findViewById(R.id.et_name)
        if (etEmail == null)
            etEmail = findViewById(R.id.et_email)
        if (etSurname == null)
            etSurname = findViewById(R.id.et_surname)
    }
    private fun deleteData(){
        button?.setOnClickListener {
            etEmail?.setText("")
            etName?.setText("")
            etSurname?.setText("")
            val action = Intent(this,MainActivity::class.java)
            startActivity(action)
        }
    }
}