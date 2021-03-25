package com.example.onlineshapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class bottoms extends AppCompatActivity {

    RecyclerView recyclerView;

    ProductAdapter adapter;

    FloatingActionButton fabCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottoms);

        recyclerView=(RecyclerView)findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new ProductAdapter(this, SuperGlobals.bottomsList);

        recyclerView.setAdapter(adapter);

        fabCart = findViewById(R.id.fabCart);
        fabCart.setOnClickListener(v -> NavigationManager.goToActivity(bottoms.this, AddToCart.class, false));
    }

}
