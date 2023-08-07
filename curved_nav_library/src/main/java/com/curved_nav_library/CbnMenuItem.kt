package com.curved_nav_library

import androidx.annotation.DrawableRes
import androidx.annotation.IdRes

data class CbnMenuItem(
    @DrawableRes
    val icon: Int,
    @DrawableRes
    val avdIcon: Int,
    @IdRes
    val destinationId: Int = -1
)