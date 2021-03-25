package com.example.onlineshapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Checkout extends AppCompatActivity {

    TextView lblAmount;
    Button btnPlaceOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        lblAmount = findViewById(R.id.lblAmount);
        btnPlaceOrder = findViewById(R.id.btnPlaceOrder);

        double amount = CartItemsManager.retrieveProductsTotal(CartItemsManager.retrieveCartItems());
        lblAmount.setText(String.valueOf(amount));
        SuperGlobals.totalPrice = amount;

        btnPlaceOrder.setOnClickListener(v -> {
            CartItemsManager.deleteAllCartItems();
            NavigationManager.goToActivity(Checkout.this, MainActivity.class, true);
        });
    }

}