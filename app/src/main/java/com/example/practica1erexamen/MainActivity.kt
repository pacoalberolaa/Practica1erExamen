package com.example.practica1erexamen

import android.annotation.SuppressLint
import android.app.Person
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var btVerificar: Button;
    private lateinit var edNombre: EditText;
    private lateinit var edPassword: EditText

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btVerificar = findViewById(R.id.btVerificar)
        btVerificar.setOnClickListener{enviarBienvenida()}
    }

    fun enviarBienvenida(){
        if ((!edNombre.text.isEmpty()) and (edPassword.equals("abcdef*"))){
            val intent = Intent(this, BienvenidoActivity::class.java)
            intent.putExtra(BienvenidoActivity.EXTRA_NOMBRE, edNombre.text.toString())
            startActivity(intent)
        }else{
            Toast.makeText(this, getString(R.string.msj_nombre), Toast.LENGTH_LONG).show()
        }
    }

}