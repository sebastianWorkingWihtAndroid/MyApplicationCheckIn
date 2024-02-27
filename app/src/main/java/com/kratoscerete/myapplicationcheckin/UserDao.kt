package com.kratoscerete.myapplicationcheckin

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao {
    @Insert
    fun insertUser(userEntity: UserEntity)

    @Query("SELECT * FROM UserEntity WHERE usuario = :usuario AND clave = :clave")
    fun getUser(usuario: String, clave: String): UserEntity?
}