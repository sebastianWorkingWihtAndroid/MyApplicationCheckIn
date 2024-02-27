package com.kratoscerete.myapplicationcheckin

import androidx.room.Dao
import androidx.room.Insert

@Dao
interface UserDao {
    @Insert
    fun insertUser(userEntity: UserEntity)
}