package com.parassidhu.tickingtimer

import android.view.View
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

    val onTimerEndAnimation: (View) -> Unit = { v ->
        v.animate()
            .alpha(0f)
            .start()
    }

    val backgroundTint: Int? = null

    val customBackground: Int? = null

    val textSize: Int? = null

    val textColor: Int = android.graphics.Color.BLACK

    val textAppearance: Int? = null

    val onFinished: (() -> Unit)? = null
}