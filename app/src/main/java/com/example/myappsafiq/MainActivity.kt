package com.example.myappsafiq

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val emailString = intent.getStringExtra("email") ?: "Hello World"
        val passwordString = intent.getStringExtra("password") ?: ""

        Log.d("email", emailString)
        Log.d("password", passwordString)
        val helloTextView = findViewById<TextView>(R.id.helloTextView)
        helloTextView.text = "Selamat Datang, $emailString!"
    }
}