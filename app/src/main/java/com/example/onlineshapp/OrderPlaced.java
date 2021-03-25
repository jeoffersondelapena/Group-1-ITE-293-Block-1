package com.example.onlineshapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;

public class OrderPlaced extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_placed);

        new Handler().postDelayed(() -> NavigationManager.goToActivity(OrderPlaced.this, MainActivity.class, true), 2000);
    }

}