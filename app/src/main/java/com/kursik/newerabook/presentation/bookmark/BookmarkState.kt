package com.kursik.newerabook.presentation.bookmark

import com.kursik.newerabook.domain.model.Article

data class BookmarkState(
    val articles: List<Article> = emptyList()
)