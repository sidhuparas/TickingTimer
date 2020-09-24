package com.parassidhu.tickingtimerapp

import android.graphics.Color
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.ScaleAnimation
import androidx.appcompat.app.AppCompatActivity
import com.parassidhu.tickingtimer.Shape
import com.parassidhu.tickingtimer.TickingTimer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (System.currentTimeMillis() % 2L == 0L)
            startView1()
        else
            startView2()
    }

    private fun startView1() {
        val config = TickingTimer.defaultConfig().apply {
            timerDuration = 10
            textSize = 50
            textColor = Color.BLACK
            shape = Shape.ROUNDED
            customBackground = R.drawable.bg_grad_blue
        }

        timerView1.start(config)

        config.shape = Shape.CIRCLE
        config.timerAnimation = ScaleAnimation(this, null)
        config.customBackground = R.drawable.bg_grad_orange

        timerView2.start(config)
    }

    private fun startView2() {
        val config = TickingTimer.defaultConfig().apply {
            timerDuration = 10
            textSize = 50
            textColor = Color.parseColor("#70FFFFFF")
            shape = Shape.ROUNDED
            customBackground = R.drawable.bg_grad_green
        }

        timerView1.start(config)

        config.shape = Shape.CIRCLE
        config.timerAnimation = ScaleAnimation(this, null)
        config.customBackground = R.drawable.bg_grad_pink

        timerView2.start(config)
    }
}