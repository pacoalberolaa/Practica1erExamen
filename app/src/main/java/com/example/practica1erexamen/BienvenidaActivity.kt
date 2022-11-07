package com.example.practica1erexamen

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BienvenidaActivity : AppCompatActivity() {

    companion object{
        val EXTRA_NOMBRE="practica1.SaludoActivity.nombre";
    }

    private lateinit var tvBienvenido: TextView;

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenida)
        tvBienvenido=findViewById(R.id.tvNombreBienvenido)

        val nombre=intent.getStringExtra(EXTRA_NOMBRE)

        tvBienvenido.text= String.format(getString(R.string.saludo),nombre)



    }
}