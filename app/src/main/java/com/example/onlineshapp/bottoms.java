package com.example.onlineshapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class bottoms extends AppCompatActivity {

    RecyclerView recyclerView;

    ProductAdapter adapter;
    List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottoms);

        productList=new ArrayList<>();
        recyclerView=(RecyclerView)findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        productList.add(
                new Product(
                        1,
                        "Saggy pants",
                        "lorem ipsum",
                        2100,
                        R.drawable.p1));
        productList.add(
                new Product(
                        2,
                        "Denim tattered pants",
                        "lorem ipsum",
                        900,
                        R.drawable.p2));

        productList.add(
                new Product(
                        3,
                        "Loose men pants",
                        "lorem ipsum",
                        1000,
                        R.drawable.p3));

        productList.add(
                new Product(
                        4,
                        "Fitted women jeans",
                        "lorem ipsum",
                        1000,
                        R.drawable.p4));

        productList.add(
                new Product(
                        5,
                        "Adidas jogging pant",
                        "lorem ipsum",
                        800,
                        R.drawable.p5));

        productList.add(
                new Product(
                        6,
                        "Denim tattered pants",
                        "lorem ipsum",
                        999,
                        R.drawable.p6));

        adapter = new ProductAdapter(this, productList);

        recyclerView.setAdapter(adapter);
    }

}
