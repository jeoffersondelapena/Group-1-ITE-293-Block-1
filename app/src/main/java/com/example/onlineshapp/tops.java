package com.example.onlineshapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class tops extends AppCompatActivity {


    RecyclerView recyclerView;

    ProductAdapter adapter;
    List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tops);

        productList=new ArrayList<>();
        recyclerView=(RecyclerView)findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        productList.add(
                new Product(
                        1,
                        "Beige lace top",
                        "lorem ipsum",
                        800,
                        R.drawable.t1));
        productList.add(
                new Product(
                        2,
                        "Black crop top",
                        "lorem ipsum",
                        500,
                        R.drawable.t2));

        productList.add(
                new Product(
                        3,
                        "Black office dress",
                        "lorem ipsum",
                        1500,
                        R.drawable.t3));

        productList.add(
                new Product(
                        4,
                        "White sleeves for men",
                        "lorem ipsum",
                        1000,
                        R.drawable.t4));

        productList.add(
                new Product(
                        5,
                        "White designed polo",
                        "lorem ipsum",
                        900,
                        R.drawable.t5));

        productList.add(
                new Product(
                        6,
                        "Black adidas tshirt",
                        "lorem ipsum",
                        1000,
                        R.drawable.t6));

        adapter = new ProductAdapter(this, productList);


        recyclerView.setAdapter(adapter);
    }
}
