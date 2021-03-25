package com.example.onlineshapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Checkout extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    TextView lblAmount;
    Button btnPlaceOrder;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
      
        lblAmount = findViewById(R.id.lblAmount);
        btnPlaceOrder = findViewById(R.id.btnPlaceOrder);
        progressBar = findViewById(R.id.progressBar);

        double amount = CartItemsManager.retrieveProductsTotal(CartItemsManager.retrieveCartItems());
        lblAmount.setText(String.valueOf(amount));
        SuperGlobals.totalPrice = amount;

        btnPlaceOrder.setOnClickListener(v -> {
            btnPlaceOrder.setVisibility(View.GONE);
            progressBar.setVisibility(View.VISIBLE);
            CartItemsManager.deleteAllCartItems();
            new Handler().postDelayed(() -> NavigationManager.goToActivity(Checkout.this, OrderPlaced.class, true), 2000);
        });
    }

}