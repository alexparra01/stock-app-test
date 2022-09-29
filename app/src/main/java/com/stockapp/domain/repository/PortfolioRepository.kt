package com.stockapp.domain.repository

import com.stockapp.domain.models.Stocks

interface PortfolioRepository {
    suspend fun retrievePortfolio(): Stocks
}