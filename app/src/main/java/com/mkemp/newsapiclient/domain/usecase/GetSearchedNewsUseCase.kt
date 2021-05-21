package com.mkemp.newsapiclient.domain.usecase

import com.mkemp.newsapiclient.domain.repository.NewsRepository

class GetSearchedNewsUseCase(private val newsRepository: NewsRepository)
{
}