package com.kursik.newerabook.presentation.home

data class HomeState(
    val newsTicker: String = "",
    val isLoading: Boolean = false
)
