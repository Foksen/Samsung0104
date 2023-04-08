package com.example.samsung0104.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.samsung0104.R;

// RXJava - для асинхронности
// Retrofit - для загрузки из интернета

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}