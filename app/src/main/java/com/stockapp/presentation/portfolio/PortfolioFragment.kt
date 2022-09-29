package com.stockapp.presentation.portfolio

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.google.android.material.snackbar.Snackbar
import com.stockapp.databinding.FragmentPortfolioBinding
import com.stockapp.domain.models.states.portfolio.PortfolioState
import com.stockapp.presentation.portfolio.adapter.PortfolioAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch


@AndroidEntryPoint
class PortfolioFragment : Fragment() {

    private var _binding: FragmentPortfolioBinding? = null
    private val viewModel by viewModels<PortfolioViewModel>()

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPortfolioBinding.inflate(inflater, container, false)

        viewModel.retrievePortfolio()

        lifecycleScope.launch{
            viewModel.uiState.collect { state ->
                when(state){
                    is PortfolioState.Success -> {
                        binding.recyclerView.visibility = View.VISIBLE
                        binding.noContent.visibility = View.GONE
                        val adapter = PortfolioAdapter(state.stocks)
                        binding.recyclerView.adapter = adapter
                    }
                    is PortfolioState.Empty -> {
                        binding.recyclerView.visibility = View.GONE
                        binding.noContent.visibility = View.VISIBLE
                    }
                    is PortfolioState.Error -> {
                        binding.recyclerView.visibility = View.GONE
                        binding.noContent.visibility = View.VISIBLE
                        Snackbar.make(binding.root, state.message!!, Snackbar.LENGTH_SHORT).show()
                    }
                }
            }
        }

        return binding.root

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}