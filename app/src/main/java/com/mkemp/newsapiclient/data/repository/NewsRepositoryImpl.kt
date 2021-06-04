package com.mkemp.newsapiclient.data.repository

import com.mkemp.newsapiclient.data.model.APIResponse
import com.mkemp.newsapiclient.data.model.Article
import com.mkemp.newsapiclient.data.repository.datasource.NewsRemoteDataSourceImpl
import com.mkemp.newsapiclient.data.util.Resource
import com.mkemp.newsapiclient.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow
import retrofit2.Response

class NewsRepositoryImpl(
    private val newsRemoteDataSourceImpl: NewsRemoteDataSourceImpl
): NewsRepository
{
    override suspend fun getNewsHeadlines(): Resource<APIResponse>
    {
        return responseToResource(newsRemoteDataSourceImpl.getTopHeadlines())
    }

    private fun responseToResource(response: Response<APIResponse>): Resource<APIResponse>
    {
        if (response.isSuccessful)
        {
            response.body()?.let { result ->
                return Resource.Success(result)
            }
        }
        return Resource.Error(response.message())
    }

    override suspend fun getSearchedNews(searchedQuery: String): Resource<APIResponse> {
        TODO("Not yet implemented")
    }

    override suspend fun saveNews(article: Article) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteNews(article: Article) {
        TODO("Not yet implemented")
    }

    override fun getSavedNews(): Flow<List<Article>> {
        TODO("Not yet implemented")
    }
}