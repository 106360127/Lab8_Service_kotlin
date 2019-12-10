package com.example.lab08_service_kotlin

import androidx.appcompat.app.AppCompatActivity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
             val intent = Intent(this,MyService::class.java)
                     startService(intent)
                 Toast.makeText(this,"啟動Service",Toast.LENGTH_LONG)

        }
    }
}
