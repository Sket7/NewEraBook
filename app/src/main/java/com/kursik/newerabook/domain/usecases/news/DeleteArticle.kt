package com.kursik.newerabook.domain.usecases.news

import com.kursik.newerabook.data.local.NewsDao
import com.kursik.newerabook.domain.model.Article
import javax.inject.Inject

class DeleteArticle @Inject constructor(
    private val newsDao: NewsDao
) {
    suspend operator fun invoke(article: Article){
        newsDao.delete(article = article)
    }
}