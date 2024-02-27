package com.kratoscerete.myapplicationcheckin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kratoscerete.myapplicationcheckin.databinding.ActivityDashBinding

class DashActivity : AppCompatActivity() {

    private lateinit var dBinding: ActivityDashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dBinding = ActivityDashBinding.inflate(layoutInflater)
        setContentView(dBinding.root)


    }
}