package com.stockapp.data.source.remote

import com.stockapp.domain.models.Stocks
import javax.inject.Inject

interface RemoteDataSource {
    suspend fun retrievePortfolio(): Stocks
}

class RemoteDataSourceImpl @Inject constructor (private val portfolioRestApi: PortfolioRestApi): RemoteDataSource {
    override suspend fun retrievePortfolio(): Stocks = portfolioRestApi.getPortfolio()
}