package com.hikizan.mybeginnersubmission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    private val SPLASH_TIME_OUT = 2500L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            val goHome = Intent(this, MainActivity::class.java)
            startActivity(goHome)
            finish()
        },SPLASH_TIME_OUT)
    }
}