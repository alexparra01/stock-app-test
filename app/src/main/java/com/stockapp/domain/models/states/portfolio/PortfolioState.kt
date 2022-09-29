package com.stockapp.domain.models.states.portfolio

import com.stockapp.domain.models.Stock

sealed interface PortfolioState {
    data class Success(val stocks: List<Stock>): PortfolioState
    data class Error(val message: String?): PortfolioState
    data class Empty(val stocks: List<Stock>): PortfolioState
}