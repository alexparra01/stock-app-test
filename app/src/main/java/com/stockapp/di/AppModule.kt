package com.stockapp.di

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import com.stockapp.data.PortfolioDataSource
import com.stockapp.data.factory.StockDataFactory
import com.stockapp.data.source.remote.RemoteDataSource
import com.stockapp.domain.repository.PortfolioRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideMoshi(): Moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()

    @Singleton
    @Provides
    fun provideStockFactory(remoteDataSource: RemoteDataSource): StockDataFactory = StockDataFactory(remoteDataSource)

    @Singleton
    @Provides
    fun providePortfolioRepository(stockDataFactory: StockDataFactory): PortfolioRepository = PortfolioDataSource(stockDataFactory)
}