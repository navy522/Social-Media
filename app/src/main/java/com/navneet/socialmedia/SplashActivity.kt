package com.navneet.socialmedia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //animating the splash image
        val backgroundImage: ImageView = findViewById(R.id.iv_splash)
        val slideAnimation = AnimationUtils.loadAnimation(this, R.anim.splash_animate)
        backgroundImage.startAnimation(slideAnimation)

        //using postDelayed method to send a message with a delayed time
        Handler().postDelayed({
            val intent = Intent(this,SignInActivity::class.java)
            startActivity(intent)
            finish()
        },2000)
    }
}