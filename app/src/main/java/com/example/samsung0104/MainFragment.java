package com.example.samsung0104;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.samsung0104.databinding.FragmentMainBinding;

public class MainFragment extends Fragment {

    FragmentMainBinding binding;
    FirstFragmentViewModel viewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentMainBinding.inflate(inflater, container, false);
        viewModel = new ViewModelProvider(this).get(FirstFragmentViewModel.class);

        binding.button.setOnClickListener(v -> {
            viewModel.onPressed();
        });

        viewModel.counter.observe(getViewLifecycleOwner(), counter -> {
            binding.textView.setText(counter.toString());
        });

        return binding.getRoot();
    }
}
