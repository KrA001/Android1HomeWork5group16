package com.example.android1homework5group16

import androidx.annotation.DrawableRes

data class Car(
    val nameCars: String,
    @DrawableRes val carImage: Int,
    val wheels: Int,
    val speed: Int
)

//  это @DrawableRes принимает только ссылки
