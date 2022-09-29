package com.stockapp.data.factory

import com.stockapp.data.source.remote.RemoteDataSource
import com.stockapp.domain.models.Stocks
import javax.inject.Inject

class StockDataFactory @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) {
    suspend fun getPortfolio(): Stocks = remoteDataSource.retrievePortfolio()
}