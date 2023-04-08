package com.example.samsung0104.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.samsung0104.databinding.FragmentCurrencyBinding;
import com.example.samsung0104.ui.viewModels.CurrencyFragmentViewModel;

public class CurrencyFragment extends Fragment {
    private FragmentCurrencyBinding binding;
    private CurrencyFragmentViewModel viewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentCurrencyBinding.inflate(inflater, container, false);
        viewModel = new ViewModelProvider(this).get(CurrencyFragmentViewModel.class);
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
