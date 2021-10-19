package com.example.aplikasikalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PilihanLingkaran extends AppCompatActivity {

    private Button mPilihansatu;
    private Button mPilihandua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihan_lingkaran);

        mPilihansatu = findViewById(R.id.diameter1);
        mPilihansatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PilihanLingkaran.this, MenghitungLingkaran.class));
            }
        });

        mPilihandua = findViewById(R.id.jari_jari1);
        mPilihandua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PilihanLingkaran.this, MenghitungLingkaranJariJari.class));
            }
        });
    }
}