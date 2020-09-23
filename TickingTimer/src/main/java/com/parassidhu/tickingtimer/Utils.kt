package com.parassidhu.tickingtimer

import android.content.Context
import android.util.TypedValue

object Utils {

    fun dp2px(context: Context, dp: Int): Float {
        val scale = context.resources.displayMetrics.density
        return (dp * scale + 0.5f)
    }

    fun sp2px(context: Context, sp: Int): Float {
        val metrics = context.resources.displayMetrics
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, sp.toFloat(), metrics)
    }
}