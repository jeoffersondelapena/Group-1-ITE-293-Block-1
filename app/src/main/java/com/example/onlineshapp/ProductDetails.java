package com.example.onlineshapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ProductDetails extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.project_details);
        ImageView prod_img = findViewById(R.id.product_image);
        TextView prod_name = findViewById(R.id.product_name);
        TextView prod_price = findViewById(R.id.product_price);
        TextView prod_details = findViewById(R.id.product_description);

        Bundle data = getIntent().getExtras();
        int prodImage = data.getInt("_prodImage");
        String prodName = data.getString("_prodName");
        String prodDetails = data.getString("_prodDetails");
        double prodPrice = data.getDouble("_prodPrice");
        prod_img.setImageResource(prodImage);
        prod_name.setText(prodName);
        prod_details.setText(prodDetails);
        prod_price.setText(Double.toString(prodPrice));

//        Button gotoCheckout = (Button) findViewById(R.id.buy_now);
//        gotoCheckout.setOnClickListener((View.OnClickListener) v -> startActivity(new Intent(ProductDetails.this, Checkout.class)));

//        Button gotoMycart = (Button) findViewById(R.id.my_cart);
//        gotoMycart.setOnClickListener((View.OnClickListener) v -> startActivity(new Intent(ProductDetails.this, AddToCart.class)));
    }

}