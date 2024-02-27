package com.codehanzoom.greenwalk

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.codehanzoom.greenwalk.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.myInfoArea.setOnClickListener {
            // myInfo로 이동

        }

    }
}