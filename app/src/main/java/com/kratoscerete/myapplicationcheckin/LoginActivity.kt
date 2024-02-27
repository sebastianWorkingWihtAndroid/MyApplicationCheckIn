package com.kratoscerete.myapplicationcheckin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kratoscerete.myapplicationcheckin.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var lBinding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(lBinding.root)

        lBinding.btnLoguear.setOnClickListener{
            val usuario = lBinding.usuario.text.toString().trim()
            val clave = lBinding.clave.text.toString().trim()

            Thread {
                val user = Application.database.userDao().getUser(usuario, clave)
                runOnUiThread {
                    if (user != null) {
                        // Credenciales válidas, iniciar sesión
                        Toast.makeText(this, "Sastifactoriamente", Toast.LENGTH_SHORT).show()

                        // Aquí puedes iniciar la siguiente actividad después del login
                        val intent = Intent(this, DashActivity::class.java)
                        startActivity(intent)
                    } else {
                        // Credenciales inválidas, mostrar un mensaje de error
                        Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show()
                    }
                }
            }.start()
        }

        lBinding.btnGoRegister.setOnClickListener{
            val goRegister = Intent(this,MainActivity::class.java)
            startActivity(goRegister)
        }


    }
}