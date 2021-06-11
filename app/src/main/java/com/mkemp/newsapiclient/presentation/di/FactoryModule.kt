package com.mkemp.newsapiclient.presentation.di

import android.app.Application
import com.mkemp.newsapiclient.data.repository.NewsRepositoryImpl
import com.mkemp.newsapiclient.data.repository.datasource.NewsRemoteDataSourceImpl
import com.mkemp.newsapiclient.domain.repository.NewsRepository
import com.mkemp.newsapiclient.domain.usecase.GetNewsHeadlinesUseCase
import com.mkemp.newsapiclient.presentation.viewmodel.NewsViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
class FactoryModule
{
    @Singleton
    @Provides
    fun provideNewsViewModelFactory(
        application: Application,
        getNewsHeadlinesUseCase: GetNewsHeadlinesUseCase)
    : NewsViewModelFactory
    {
        return NewsViewModelFactory(application, getNewsHeadlinesUseCase)
    }
}