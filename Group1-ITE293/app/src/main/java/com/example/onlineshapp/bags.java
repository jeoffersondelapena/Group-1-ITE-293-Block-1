package com.example.onlineshapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class bags extends AppCompatActivity {


    RecyclerView recyclerView;

    ProductAdapter adapter;
    List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bags);

        productList=new ArrayList<>();
        recyclerView=(RecyclerView)findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        productList.add(
                new Product(
                        1,
                        "Small messenger bag",
                        "lorem ipsum",
                        1500,
                        R.drawable.b1));
        productList.add(
                new Product(
                        2,
                        "Double travel bag",
                        "lorem ipsum",
                        2000,
                        R.drawable.b2));

        productList.add(
                new Product(
                        3,
                        "Pink fashionista bag",
                        "lorem ipsum",
                        1000,
                        R.drawable.b3));

        productList.add(
                new Product(
                        4,
                        "Brown messenger bag",
                        "lorem ipsum",
                        2000,
                        R.drawable.b4));

        productList.add(
                new Product(
                        5,
                        "Channel boy travel bag",
                        "lorem ipsum",
                        2500,
                        R.drawable.b5));

        productList.add(
                new Product(
                        6,
                        "Louie style black bag",
                        "lorem ipsum",
                        1000,
                        R.drawable.b6));

        adapter = new ProductAdapter(this, productList);


        recyclerView.setAdapter(adapter);
    }
}
