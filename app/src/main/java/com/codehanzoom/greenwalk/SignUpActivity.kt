package com.codehanzoom.greenwalk

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)


//        Move to Home activity
        findViewById<Button>(R.id.signUpApprovalBtn).setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }
}