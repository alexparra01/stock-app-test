package com.stockapp.data

import com.stockapp.data.factory.StockDataFactory
import com.stockapp.domain.models.Stocks
import com.stockapp.domain.repository.PortfolioRepository
import javax.inject.Inject

class PortfolioDataSource @Inject constructor (private val factory: StockDataFactory): PortfolioRepository {
    override suspend fun retrievePortfolio(): Stocks = factory.getPortfolio()
}