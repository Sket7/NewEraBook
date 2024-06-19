package com.kursik.newerabook.presentation.onboarding

import androidx.annotation.DrawableRes
import com.kursik.newerabook.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        title = "Первая страница Пейджера",
        description = "Все это сделано на Компоте с использованием КлинАрхитектор",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Вторая страница Пейджера",
        description = "Я сделал это по видео, так что слабо разбираюсь во всех аспектах приложения",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Третья страница Пейджера",
        description = "Думаю, заслуженная оценка - заслуженному студенту",
        image = R.drawable.onboarding3
    )
)