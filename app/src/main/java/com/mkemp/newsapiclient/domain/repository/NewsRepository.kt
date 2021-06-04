package com.mkemp.newsapiclient.domain.repository

import com.mkemp.newsapiclient.data.model.APIResponse
import com.mkemp.newsapiclient.data.model.Article
import com.mkemp.newsapiclient.data.util.Resource
import kotlinx.coroutines.flow.Flow

interface NewsRepository {
    suspend fun getNewsHeadlines(): Resource<APIResponse> // When I only care about success or failure I don't really need a callback
    suspend fun getSearchedNews(searchedQuery: String): Resource<APIResponse>
    suspend fun saveNews(article: Article)
    suspend fun deleteNews(article: Article)

    fun getSavedNews(): Flow<List<Article>> // For always changing data I need a callback // Do NOT make this suspend
}