package com.stockapp.presentation.portfolio

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.stockapp.domain.models.states.portfolio.PortfolioState
import com.stockapp.domain.repository.PortfolioRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class PortfolioViewModel @Inject constructor(
    private val portfolioRepository: PortfolioRepository
): ViewModel() {

    private val _uiState = MutableStateFlow<PortfolioState>(PortfolioState.Empty(emptyList()))
    val uiState: StateFlow<PortfolioState> = _uiState

    fun retrievePortfolio() {
        viewModelScope.launch(Dispatchers.Default) {
            try {
                val result = portfolioRepository.retrievePortfolio()
                withContext(Dispatchers.Main){
                    if (result.stocks.isEmpty()){
                        _uiState.value = PortfolioState.Empty(result.stocks)
                    }else {
                        _uiState.value = PortfolioState.Success(result.stocks)
                    }
                }
            }catch (e: Exception){
                _uiState.value = PortfolioState.Error(e.message)
            }
        }
    }
}