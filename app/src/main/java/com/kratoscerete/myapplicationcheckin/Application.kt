package com.kratoscerete.myapplicationcheckin

import android.app.Application
import androidx.room.Database
import androidx.room.Room

class Application : Application() {

    companion object{
        lateinit var database: AppDatabase
    }

    override fun onCreate() {
        super.onCreate()
        database = Room.databaseBuilder(this, AppDatabase::class.java,"DatabaseKratos")
            .build()
    }
}