package com.mkemp.newsapiclient.presentation.di

import com.mkemp.newsapiclient.data.repository.NewsRepositoryImpl
import com.mkemp.newsapiclient.data.repository.datasource.NewsRemoteDataSourceImpl
import com.mkemp.newsapiclient.domain.repository.NewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
class RepositoryModule
{
    @Singleton
    @Provides
    fun provideNewsRepository(newsRemoteDataSourceImpl: NewsRemoteDataSourceImpl): NewsRepository
    {
        return NewsRepositoryImpl(newsRemoteDataSourceImpl)
    }
}