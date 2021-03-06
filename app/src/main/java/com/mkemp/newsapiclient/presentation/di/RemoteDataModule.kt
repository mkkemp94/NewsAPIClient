package com.mkemp.newsapiclient.presentation.di

import com.mkemp.newsapiclient.data.api.NewsAPIService
import com.mkemp.newsapiclient.data.repository.datasource.NewsRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RemoteDataModule
{
    @Singleton
    @Provides
    fun provideNewsRemoteDataSource(newsAPIService: NewsAPIService): NewsRemoteDataSourceImpl
    {
        // I'm not using interfaces so I technically don't need this provider...
        return NewsRemoteDataSourceImpl(newsAPIService)
    }
}