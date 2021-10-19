package com.example.aplikasikalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mLingkaran;
    private Button mPersegi;
    private Button mSegitiga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLingkaran = findViewById(R.id.lingkaran);
        mLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, PilihanLingkaran.class));
            }
        });

        mPersegi = findViewById(R.id.persegi);
        mPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, PilihanPersegi.class));
            }
        });

        mSegitiga = findViewById(R.id.segitiga);
        mSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, PilihanSegiitiga.class));
            }
        });
    }
}