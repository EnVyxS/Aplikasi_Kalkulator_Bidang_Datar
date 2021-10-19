package com.example.aplikasikalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PilihanPersegi extends AppCompatActivity {

    private Button mPilihansatu;
    private Button mPilihandua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihan_persegi);

        mPilihansatu = findViewById(R.id.persegi1);
        mPilihansatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PilihanPersegi.this, MenghitungPersegi.class));
            }
        });

        mPilihandua = findViewById(R.id.persegipanjang);
        mPilihandua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PilihanPersegi.this, MenghitungPersegiPanjang.class));
            }
        });
    }


}