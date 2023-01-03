package com.fridofirman.UAS_Frido.ui.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.fridofirman.UAS_Frido.R
import com.fridofirman.UAS_Frido.ui.main.HomeActivity

class SplashActivity : AppCompatActivity() {

    private lateinit var handler : Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        handler = Handler(mainLooper)
        handler.postDelayed({
            val intent = Intent(this@SplashActivity, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }, 2500)
    }
}