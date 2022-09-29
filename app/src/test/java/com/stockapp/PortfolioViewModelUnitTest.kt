package com.stockapp

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import com.stockapp.domain.models.Stocks
import com.stockapp.domain.models.states.portfolio.PortfolioState
import com.stockapp.domain.repository.PortfolioRepository
import com.stockapp.presentation.portfolio.PortfolioViewModel
import com.stockapp.util.MainDispatcherRule
import com.stockapp.util.Sample
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.delay
import kotlinx.coroutines.test.*
import org.hamcrest.CoreMatchers.instanceOf
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner
import org.mockito.kotlin.mock
import org.mockito.kotlin.whenever


@RunWith(MockitoJUnitRunner::class)
class PortfolioViewModelUnitTest {

    private lateinit var portfolioViewModel:PortfolioViewModel
    private lateinit var repository: PortfolioRepository
    private lateinit var moshiAdapter: JsonAdapter<Stocks>

    @get:Rule
    val mainDispatcherRule = MainDispatcherRule()

    @Before
    fun setup(){
        val moshi = Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()
        moshiAdapter = moshi.adapter(Stocks::class.java)
        repository = mock()
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun callRepositoryAndGetSuccessfulResponse() = runTest  {
        val stocks = moshiAdapter.fromJson(Sample.jsonPortfolio)
        whenever(repository.retrievePortfolio()).thenReturn(stocks)

        portfolioViewModel = PortfolioViewModel(repository)
        portfolioViewModel.retrievePortfolio()
        advanceUntilIdle()

        assertThat(portfolioViewModel.uiState.value, instanceOf(PortfolioState.Empty::class.java))
        delay(500L)
        assertThat(portfolioViewModel.uiState.value, instanceOf(PortfolioState.Success::class.java))

    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun callRepositoryAndGetEmptyResponse() = runTest  {
        val stocks = moshiAdapter.fromJson(Sample.jsonPortfolioEmpty)
        whenever(repository.retrievePortfolio()).thenReturn(stocks)

        portfolioViewModel = PortfolioViewModel(repository)
        portfolioViewModel.retrievePortfolio()
        advanceUntilIdle()

        assertThat(portfolioViewModel.uiState.value, instanceOf(PortfolioState.Empty::class.java))
        delay(500L)
        assertThat(portfolioViewModel.uiState.value, instanceOf(PortfolioState.Empty::class.java))

    }

}