package com.mkemp.newsapiclient.domain.usecase

import com.mkemp.newsapiclient.data.model.Article
import com.mkemp.newsapiclient.domain.repository.NewsRepository

class SaveNewsUseCase(private val newsRepository: NewsRepository)
{
    suspend fun execute(article: Article) = newsRepository.saveNews(article)
}