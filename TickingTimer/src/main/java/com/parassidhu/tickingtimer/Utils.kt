package com.parassidhu.tickingtimer

import android.content.Context
import android.view.View
import android.view.animation.Animation
import android.view.animation.ScaleAnimation

object Utils {

    fun dp2px(context: Context, dp: Int): Float {
        val scale = context.resources.displayMetrics.density
        return (dp * scale + 0.5f)
    }
}