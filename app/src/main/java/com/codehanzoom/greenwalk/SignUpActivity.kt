package com.codehanzoom.greenwalk

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.codehanzoom.greenwalk.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContent {
//            Greeting(name = "james")
//        }

        val binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        Move to Home activity
        binding.signUpApprovalBtn.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }
}
@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name")
}
@Preview(showBackground = true, widthDp = 320, heightDp = 640)
@Composable
fun Preview() {
    Greeting(name = "james")
}