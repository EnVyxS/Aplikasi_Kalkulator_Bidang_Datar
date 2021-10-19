package com.example.aplikasikalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PilihanSegiitiga extends AppCompatActivity {

    private Button mPilihansatu;
    private Button mPilihandua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihan_segiitiga);


        mPilihansatu = findViewById(R.id.segitiga);
        mPilihansatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PilihanSegiitiga.this, MenghitungSegitiga.class));
            }
        });

        mPilihandua = findViewById(R.id.segitigaSembarang);
        mPilihandua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PilihanSegiitiga.this, MenghitungSegitigaSembarang.class));
            }
        });
    }
}