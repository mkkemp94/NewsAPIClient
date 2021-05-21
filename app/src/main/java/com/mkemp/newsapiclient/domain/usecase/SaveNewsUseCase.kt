package com.mkemp.newsapiclient.domain.usecase

import com.mkemp.newsapiclient.domain.repository.NewsRepository

class SaveNewsUseCase(private val newsRepository: NewsRepository)
{
}