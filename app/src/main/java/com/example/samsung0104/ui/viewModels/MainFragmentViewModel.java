package com.example.samsung0104.ui.viewModels;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.samsung0104.data.db.SimplePriceData;
import com.example.samsung0104.data.repositories.CurrencyRepository;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class MainFragmentViewModel extends ViewModel {
    public final MutableLiveData<List<SimplePriceData>> prices = new MutableLiveData<>();
    // Mutable - изменяемые данные
    Disposable priceDisposable;

    public void onRefreshed() {
        priceDisposable = CurrencyRepository.getPriceData("USD,EUR,CNY,INR,GBP", "RUB")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(prices::setValue);
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        priceDisposable.dispose();
    }
}
