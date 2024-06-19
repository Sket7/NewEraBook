package com.kursik.newerabook.presentation.details

import com.kursik.newerabook.domain.model.Article

sealed class DetailsEvent {
    data class UpsertDeleteArticle(val article: Article) : DetailsEvent()

    data object RemoveSideEffect : DetailsEvent()

}