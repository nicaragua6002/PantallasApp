package com.appsnica.pantallasapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
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

        //Accedemos a los widget o controles
        val btniniciar = findViewById<Button>(R.id.login_button)
        //definimos la accion del boton
        btniniciar.setOnClickListener{
            //Instanciamos la nueva actividad
           val intent = Intent(this, MainMenu::class.java)
            //Iniciamos la nueva actividad
            startActivity(intent)
        }
    }
}