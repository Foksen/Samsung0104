package com.example.samsung0104.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.samsung0104.ui.viewModels.MainFragmentViewModel;
import com.example.samsung0104.ui.adapters.PriceAdapter;
import com.example.samsung0104.databinding.FragmentMainBinding;

public class MainFragment extends Fragment {

    FragmentMainBinding binding;
    MainFragmentViewModel viewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        viewModel = new ViewModelProvider(this).get(MainFragmentViewModel.class);
        binding = FragmentMainBinding.inflate(inflater, container, false);

        viewModel.onRefreshed();

        viewModel.prices.observe(getViewLifecycleOwner(), priceData -> {
            PriceAdapter priceAdapter = new PriceAdapter(priceData);
            binding.recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
            binding.recyclerView.setAdapter(priceAdapter);
        });

        return binding.getRoot();
    }
}
