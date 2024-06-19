package com.kursik.newerabook.data.remote.dto

import com.kursik.newerabook.domain.model.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)