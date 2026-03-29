package com.smartrasoi.app.activities

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.smartrasoi.app.R

class OnboardingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

        val btnGetStarted = findViewById<TextView>(R.id.btnGetStarted)
        btnGetStarted.setOnClickListener {
            // F1: Intent - Navigate from Login/Splash to Main Dashboard passing data
            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra("USER_NAME", "Guest User") // Passing some data
            }
            startActivity(intent)
            finish()
        }
    }
}
