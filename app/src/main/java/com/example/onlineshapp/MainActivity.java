package com.example.onlineshapp;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button shoes = findViewById(R.id.shoes);
        shoes.setOnClickListener(view -> goToActivity(shoes.class));

        Button bags = findViewById(R.id.bags);
        bags.setOnClickListener(view -> goToActivity(bags.class));

        Button tops = findViewById(R.id.tops);
        tops.setOnClickListener(view -> goToActivity(tops.class));

        Button bottoms = findViewById(R.id.bottoms);
        bottoms.setOnClickListener(view -> goToActivity(bottoms.class));
    }

    private void goToActivity(Class _class) {
        NavigationManager.goToActivity(MainActivity.this, _class, false);
    }

}
