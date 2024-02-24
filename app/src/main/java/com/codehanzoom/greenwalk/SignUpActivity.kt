package com.codehanzoom.greenwalk

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.codehanzoom.greenwalk.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        Move to Home activity
        binding.signUpApprovalBtn.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }
}