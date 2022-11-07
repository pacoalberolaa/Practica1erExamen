package com.example.practica1erexamen

import android.annotation.SuppressLint
import android.app.Person
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var btVerificar: Button;
    private lateinit var edNombre: EditText;
    private lateinit var edPassword: EditText

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btVerificar = findViewById(R.id.btVerificar)
        btVerificar.setOnClickListener()
    }

}