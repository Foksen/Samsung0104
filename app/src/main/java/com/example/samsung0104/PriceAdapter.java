package com.example.samsung0104;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.samsung0104.databinding.CurrencyItemBinding;

import java.util.List;

public class PriceAdapter extends RecyclerView.Adapter<PriceAdapter.CurrencyViewHolder> {

    private List<SimplePriceData> data;

    public PriceAdapter(List<SimplePriceData> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public CurrencyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CurrencyItemBinding binding = CurrencyItemBinding.inflate(
                LayoutInflater.from(parent.getContext()), parent, false);
        return new CurrencyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CurrencyViewHolder holder, int position) {
        SimplePriceData currentPriceData = data.get(position);
        holder.priceNameView.setText(currentPriceData.name);
        holder.priceValueView.setText(String.valueOf(currentPriceData.price));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class CurrencyViewHolder extends RecyclerView.ViewHolder {
        TextView priceNameView;
        TextView priceValueView;
        public CurrencyViewHolder(CurrencyItemBinding binding) {
            super(binding.getRoot());;
            priceNameView = binding.priceName;
            priceValueView = binding.priceValue;
        }
    }
}
