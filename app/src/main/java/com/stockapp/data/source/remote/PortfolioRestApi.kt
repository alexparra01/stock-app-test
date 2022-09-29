package com.stockapp.data.source.remote

import com.stockapp.data.util.Constants
import com.stockapp.domain.models.Stocks
import retrofit2.http.GET
import retrofit2.http.Headers

interface PortfolioRestApi {

    @Headers("Accept: application/json")
    @GET(Constants.PORTFOLIO_RELATIVE_URL)
    suspend fun getPortfolio(): Stocks
}