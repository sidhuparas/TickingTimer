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

        val config = TickingTimer.defaultConfig().apply {
            timerDuration = 10
            textSize = 50
            textColor = Color.BLACK
            shape = Shape.ROUNDED
        }

        timerView1.start(config)

        config.shape = Shape.CIRCLE
        config.timerAnimation = ScaleAnimation(this, null)

        timerView2.start(config)
    }
}