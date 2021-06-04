package com.mkemp.newsapiclient.domain.usecase

import com.mkemp.newsapiclient.data.model.APIResponse
import com.mkemp.newsapiclient.data.util.Resource
import com.mkemp.newsapiclient.domain.repository.NewsRepository

class GetSearchedNewsUseCase(private val newsRepository: NewsRepository)
{
    suspend fun execute(searchQuery: String): Resource<APIResponse>
    {
        return newsRepository.getSearchedNews(searchQuery)
    }
}