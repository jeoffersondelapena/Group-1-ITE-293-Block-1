package com.example.onlineshapp;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button shoes = (Button) findViewById(R.id.shoes);
        shoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, shoes.class));
            }
        });

        Button bags = (Button) findViewById(R.id.bags);
        bags.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, bags.class));
            }
        });

        Button tops = (Button) findViewById(R.id.tops);
        tops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, tops.class));
            }
        });

        Button bottoms = (Button) findViewById(R.id.bottoms);
        bottoms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, bottoms.class));
            }
        });
    }
}
