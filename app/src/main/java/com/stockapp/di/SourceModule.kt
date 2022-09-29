package com.stockapp.di

import com.stockapp.data.source.remote.PortfolioRestApi
import com.stockapp.data.source.remote.RemoteDataSource
import com.stockapp.data.source.remote.RemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object SourceModule {

    @Singleton
    @Provides
    fun provideRemoteDataSource(portfolioRestApi: PortfolioRestApi): RemoteDataSource {
        return RemoteDataSourceImpl(portfolioRestApi)
    }
}