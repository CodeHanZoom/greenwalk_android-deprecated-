package com.codehanzoom.greenwalk

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.codehanzoom.greenwalk.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private var currentFragment = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginBtn.setOnClickListener {
//            로그인 요청

//            토큰 확인

//            intent 이동 후 activity 삭제
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }

        binding.signUpBtn.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }

    }
}