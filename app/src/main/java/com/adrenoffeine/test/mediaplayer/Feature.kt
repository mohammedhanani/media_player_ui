package com.adrenoffeine.test.mediaplayer

import android.service.autofill.OnClickAction
import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color

data class Feature(
    val Title:String,
    @DrawableRes val iconId:Int,
    val lightColor : Color,
    val mediumColor:Color,
    val darkColor:Color,

)