package com.parassidhu.tickingtimerapp

import android.graphics.Color
import android.graphics.Interpolator
import android.os.Bundle
import android.view.animation.AccelerateInterpolator
import android.view.animation.Animation
import android.view.animation.RotateAnimation
import android.view.animation.TranslateAnimation
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.parassidhu.tickingtimer.Shape
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        timerView1.start {
            timerDuration(8)
            backgroundTint(Color.parseColor("#EEC0C6"))
            textSize(50)
            textColor(Color.BLACK)
            shape(Shape.ROUNDED)
        }

        timerView2.start {
            timerDuration(8)
            backgroundTint(Color.parseColor("#EAEFB1"))
            textSize(50)
            textColor(Color.BLACK)
            shape(Shape.ROUNDED)
        }

        timerView3.start {
            timerDuration(8)
            backgroundTint(Color.parseColor("#B4ADEA"))
            textSize(90)
            textColor(Color.BLACK)
            shape(Shape.CIRCLE)
        }
    }

    private fun rotateAnimation() =
        RotateAnimation(
            0f,
            360f,
            Animation.RELATIVE_TO_SELF,
            0.5f,
            Animation.RELATIVE_TO_SELF,
            0.5f
        ).apply {
            duration = 1000
            repeatCount = Int.MAX_VALUE
            repeatMode = Animation.REVERSE
            interpolator = AccelerateInterpolator()
        }
}