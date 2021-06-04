package com.mkemp.newsapiclient.domain.usecase

import com.mkemp.newsapiclient.data.model.Article
import com.mkemp.newsapiclient.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class GetSavedNewsUseCase(private val newsRepository: NewsRepository)
{
    fun execute(): Flow<List<Article>>
    {
        return newsRepository.getSavedNews()
    }
}