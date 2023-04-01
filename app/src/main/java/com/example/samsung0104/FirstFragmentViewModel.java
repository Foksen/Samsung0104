package com.example.samsung0104;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FirstFragmentViewModel extends ViewModel {
    final MutableLiveData<Integer> counter = new MutableLiveData<>(0);  // Mutable - изменяемые данные

    void onPressed() {
        int tempCounter = counter.getValue() + 1;
        counter.setValue(tempCounter);
    }
}
