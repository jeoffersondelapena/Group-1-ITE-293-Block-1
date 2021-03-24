package com.example.onlineshapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class shoes extends AppCompatActivity {


    RecyclerView recyclerView;

    ProductAdapter adapter;
    List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoes);

        productList=new ArrayList<>();
        recyclerView=(RecyclerView)findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        productList.add(
                new Product(
                        1,
                        "Black leather office shoes",
                        "lorem ipsum",
                        1000,
                         R.drawable.s1));
        productList.add(
                new Product(
                        2,
                        "Plan black leather shoesProduct 2",
                        "lorem ipsum",
                        999,
                        R.drawable.s2));

        productList.add(
                new Product(
                        3,
                        "White nike rubber shoes",
                        "lorem ipsum",
                        2000,
                        R.drawable.s3));

        productList.add(
                new Product(
                        4,
                        "Gold heels",
                        "lorem ipsum",
                        5000,
                        R.drawable.s4));

        productList.add(
                new Product(
                        5,
                        "Gray heels",
                        "lorem ipsum",
                        800,
                        R.drawable.s5));

        productList.add(
                new Product(
                        6,
                        "Black white rubber shoes",
                        "lorem ipsum",
                        1500,
                        R.drawable.s6));





        adapter = new ProductAdapter(this, productList);


        recyclerView.setAdapter(adapter);
    }
}
