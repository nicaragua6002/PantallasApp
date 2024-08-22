package com.appsnica.pantallasapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //Accedemos a los widget o controles
        val btnEmpleado = findViewById<Button>(R.id.employee_management_button)
        //definimos la accion del boton
        btnEmpleado.setOnClickListener{
            //Instanciamos la nueva actividad
            val intent = Intent(this, Empleados::class.java)
            //Iniciamos la nueva actividad
            startActivity(intent)
        }

        //Accedemos a los widget o controles
        val btnReportes = findViewById<Button>(R.id.reports_button)
        //definimos la accion del boton
        btnReportes.setOnClickListener{
            //Instanciamos la nueva actividad
            val intent = Intent(this, Reportes::class.java)
            //Iniciamos la nueva actividad
            startActivity(intent)
        }

        //Accedemos a los widget o controles
        val btnConfig = findViewById<Button>(R.id.settings_button)
        //definimos la accion del boton
        btnConfig.setOnClickListener{
            //Instanciamos la nueva actividad
            val intent = Intent(this, Configuraciones::class.java)
            //Iniciamos la nueva actividad
            startActivity(intent)
        }
    }
}