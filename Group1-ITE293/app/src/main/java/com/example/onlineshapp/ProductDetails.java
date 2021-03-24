package com.example.onlineshapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ProductDetails extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_details);
        ImageView prod_img = findViewById(R.id.product_image);
        TextView prod_name = findViewById(R.id.product_name);
        TextView prod_price = findViewById(R.id.product_price);

        Bundle data = getIntent().getExtras();
        int prodImage = data.getInt("_prodImage");
        String prodName = data.getString("_prodName");
        double prodPrice = data.getDouble("_prodPrice");
        prod_img.setImageResource(prodImage);
        prod_name.setText(prodName);
        prod_price.setText(Double.toString(prodPrice));


    }
}
