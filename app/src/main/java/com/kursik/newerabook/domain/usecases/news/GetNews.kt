package com.kursik.newerabook.domain.usecases.news

import androidx.paging.PagingData
import com.kursik.newerabook.domain.model.Article
import com.kursik.newerabook.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetNews @Inject constructor(
    private val newsRepository: NewsRepository
) {
    operator fun invoke(sources: List<String>): Flow<PagingData<Article>> {
        return newsRepository.getNews(sources = sources)
    }
}