package com.mkemp.newsapiclient.data.repository.datasource

import com.mkemp.newsapiclient.data.api.NewsAPIService
import com.mkemp.newsapiclient.data.model.APIResponse
import retrofit2.Response

class NewsRemoteDataSourceImpl(private val newsAPIService: NewsAPIService)
{
    suspend fun getTopHeadlines(country: String, page: Int): Response<APIResponse>
    {
        return newsAPIService.getTopHeadlines(country, page)
    }
}