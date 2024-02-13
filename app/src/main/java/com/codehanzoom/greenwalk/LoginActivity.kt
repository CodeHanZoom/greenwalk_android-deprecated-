package com.codehanzoom.greenwalk

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    private var currentFragment = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        findViewById<Button>(R.id.loginBtn).setOnClickListener {
//            로그인 요청

//            토큰 확인

//            intent 이동 후 activity 삭제
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }

        findViewById<Button>(R.id.signUpBtn).setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }

    }
}