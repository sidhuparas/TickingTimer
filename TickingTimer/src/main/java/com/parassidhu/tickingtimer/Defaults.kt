package com.parassidhu.tickingtimer

import android.view.animation.Animation
import android.view.animation.ScaleAnimation

internal object Defaults {

    val timerDuration: Int = 3
    val shape: Shape = Shape.CIRCLE

    fun getTimerAnimation(scaleX: Float, scaleY: Float): Animation = ScaleAnimation(
        scaleX,
        scaleX * 1.2f,
        scaleY,
        scaleY * 1.2f,
        Animation.RELATIVE_TO_SELF,
        0.5f,
        Animation.RELATIVE_TO_SELF,
        0.5f
    ).apply {
        duration = 1000
        repeatMode = Animation.REVERSE
        repeatCount = Int.MAX_VALUE
    }
}