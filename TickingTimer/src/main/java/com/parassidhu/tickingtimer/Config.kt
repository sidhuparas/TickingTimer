package com.parassidhu.tickingtimer

import android.view.View
import android.view.animation.Animation

data class Config (

    var timerDuration: Int = Defaults.timerDuration,

    var shape: Shape = Defaults.shape,

    var timerAnimation: Animation = Defaults.getTimerAnimation(1f, 1f),

    var onTimerEndAnimation: (View) -> Unit = Defaults.onTimerEndAnimation,

    var backgroundTint: Int? = Defaults.backgroundTint,

    var customBackground: Int? = Defaults.customBackground,

    var textSize: Int = Defaults.textSize,

    var textColor: Int = Defaults.textColor,

    var textAppearance: Int? = Defaults.textAppearance,

    var onFinished: (() -> Unit)? = Defaults.onFinished,

    var onTick: ((Int) -> Unit)? = Defaults.onTick
)