package com.kursik.newerabook.domain.usecases.news

import com.kursik.newerabook.data.local.NewsDao
import com.kursik.newerabook.domain.model.Article
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetSavedArticles @Inject constructor(
    private val newsDao: NewsDao
) {

    operator fun invoke(): Flow<List<Article>>{
        return newsDao.getArticles()
    }

}