package com.codehanzoom.greenwalk

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashInit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_init)

        Handler().postDelayed({
            val intent = Intent(this@SplashInit, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }, 1000)
    }
}