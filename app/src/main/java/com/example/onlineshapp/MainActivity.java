package com.example.onlineshapp;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button shoes = findViewById(R.id.shoes);
        shoes.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, shoes.class)));

        Button bags = findViewById(R.id.bags);
        bags.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, bags.class)));

        Button tops = findViewById(R.id.tops);
        tops.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, tops.class)));

        Button bottoms = findViewById(R.id.bottoms);
        bottoms.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, bottoms.class)));
    }

}
