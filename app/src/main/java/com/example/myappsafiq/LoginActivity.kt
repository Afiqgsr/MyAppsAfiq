package com.example.myappsafiq

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val button = findViewById<Button>(R.id.LoginButton)
        val emailtext = findViewById<EditText>(R.id.emailText)
        val passwordtext = findViewById<EditText>(R.id.editTextTextPassword)
        button.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            val email = emailtext.text.toString()
            val password = passwordtext.text.toString()
            intent.putExtra("email", email)
            intent.putExtra("password",password)
            startActivity(intent)
        }
    }
}