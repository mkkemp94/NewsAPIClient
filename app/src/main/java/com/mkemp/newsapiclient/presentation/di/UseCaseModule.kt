package com.mkemp.newsapiclient.presentation.di

import com.mkemp.newsapiclient.data.repository.NewsRepositoryImpl
import com.mkemp.newsapiclient.data.repository.datasource.NewsRemoteDataSourceImpl
import com.mkemp.newsapiclient.domain.repository.NewsRepository
import com.mkemp.newsapiclient.domain.usecase.GetNewsHeadlinesUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule
{
    @Singleton
    @Provides
    fun provideNewsHeadLinesUseCase(newsRepository: NewsRepository): GetNewsHeadlinesUseCase
    {
        return GetNewsHeadlinesUseCase(newsRepository)
    }
}