package com.kursik.newerabook.presentation.search

import androidx.paging.PagingData
import com.kursik.newerabook.domain.model.Article
import kotlinx.coroutines.flow.Flow

data class SearchState(
    val searchQuery: String = "",
    val articles: Flow<PagingData<Article>>? = null
)