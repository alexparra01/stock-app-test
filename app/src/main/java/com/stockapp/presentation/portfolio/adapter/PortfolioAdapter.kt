package com.stockapp.presentation.portfolio.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.stockapp.databinding.PortfolioItemBinding
import com.stockapp.domain.models.Stock
import com.stockapp.presentation.util.convertTimeStamp

class PortfolioAdapter(private val portfolio: List<Stock>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding = PortfolioItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PortfolioViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is PortfolioViewHolder -> {
                holder.bind(portfolio[position])
            }
        }
    }

    override fun getItemCount(): Int = portfolio.size

    inner class PortfolioViewHolder(private val binding: PortfolioItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(stock: Stock){
            binding.ticker.text = stock.ticker
            binding.name.text = stock.name
            binding.currency.text = stock.currency
            binding.currentPriceCents.text = stock.current_price_cents.toString()
            binding.quantity.text = if (stock.quantity == null) "-" else stock.quantity.toString()
            binding.time.text = stock.current_price_timestamp.convertTimeStamp()
        }
    }
}