package com.kratoscerete.myapplicationcheckin

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "UserEntity")
data class UserEntity(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val nombre: String,
    val cedula: String,
    val telefono: String,
    val usuario: String,
    val clave : String
)
