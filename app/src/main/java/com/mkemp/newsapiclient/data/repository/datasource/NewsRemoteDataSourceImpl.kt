package com.mkemp.newsapiclient.data.repository.datasource

import com.mkemp.newsapiclient.data.api.NewsAPIService
import com.mkemp.newsapiclient.data.model.APIResponse
import retrofit2.Response

class NewsRemoteDataSourceImpl(
    private val newsAPIService: NewsAPIService,
    private val country: String,
    private val page: Int
)
{
    suspend fun getTopHeadlines(): Response<APIResponse>
    {
        return newsAPIService.getTopHeadlines(country, page)
    }
}