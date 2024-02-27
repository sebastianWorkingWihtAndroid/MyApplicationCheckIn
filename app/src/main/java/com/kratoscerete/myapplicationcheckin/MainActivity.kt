package com.kratoscerete.myapplicationcheckin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.kratoscerete.myapplicationcheckin.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        mBinding.btnRegister.setOnClickListener{
            // Acciones cuando se hace clic en el botón de registro

            // Obtener valores de los campos de entrada
            val nombre = mBinding.nombre.text.toString().trim()
            val cedula = mBinding.cedula.text.toString().trim()
            val telefono = mBinding.telefono.text.toString().trim()
            val usuario = mBinding.usuario.text.toString().trim()
            val clave = mBinding.clave.text.toString().trim()

            Thread{
            // Crear una instancia de UserEntity con los datos ingresados
            val user = UserEntity(0, nombre, cedula, telefono, usuario, clave)

            // Insertar el usuario en la base de datos
            Application.database.userDao().insertUser(user)

            }.start()
            // Muestra un mensaje o realiza otra acción según sea necesario
            Toast.makeText(this, "Usuario registrado: $nombre", Toast.LENGTH_SHORT).show()


        }
    }
}