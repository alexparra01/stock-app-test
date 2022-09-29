package com.stockapp.domain.models

data class Stock(
    val ticker: String,
    val name: String,
    val currency: String,
    val current_price_cents: Double,
    val quantity: Double?,
    val current_price_timestamp: Long,
)
