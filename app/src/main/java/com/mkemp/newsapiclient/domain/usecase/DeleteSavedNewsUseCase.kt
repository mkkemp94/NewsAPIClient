package com.mkemp.newsapiclient.domain.usecase

import com.mkemp.newsapiclient.domain.repository.NewsRepository

class DeleteSavedNewsUseCase(private val newsRepository: NewsRepository)
{
}