package com.example.onlineshapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class AddToCart extends AppCompatActivity {

    RecyclerView recyclerView;
    ProductAdapter adapter;

    TextView lblAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_to_cart);

        lblAmount = findViewById(R.id.lblAmount);

        Button checkOut = (Button) findViewById(R.id.checkout);
        checkOut.setOnClickListener(v -> startActivity(new Intent(AddToCart.this, Checkout.class)));

        recyclerView = (RecyclerView) findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new ProductAdapter(this, CartItemsManager.retrieveCartItems(), lblAmount);

        recyclerView.setAdapter(adapter);

        double amount = CartItemsManager.retrieveProductsTotal(CartItemsManager.retrieveCartItems());
        lblAmount.setText(String.valueOf(amount));
    }

}