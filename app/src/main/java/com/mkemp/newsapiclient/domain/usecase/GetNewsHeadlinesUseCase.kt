package com.mkemp.newsapiclient.domain.usecase

import com.mkemp.newsapiclient.data.model.APIResponse
import com.mkemp.newsapiclient.data.util.Resource
import com.mkemp.newsapiclient.domain.repository.NewsRepository

class GetNewsHeadlinesUseCase(private val newsRepository: NewsRepository)
{
    suspend fun execute(): Resource<APIResponse>
    {
        // Can modify this data as we please before we send it back to the view model...
        return newsRepository.getNewsHeadlines()
    }
}