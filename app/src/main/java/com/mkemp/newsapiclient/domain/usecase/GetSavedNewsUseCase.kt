package com.mkemp.newsapiclient.domain.usecase

import com.mkemp.newsapiclient.domain.repository.NewsRepository

class GetSavedNewsUseCase(private val newsRepository: NewsRepository)
{
}