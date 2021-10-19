package com.example.aplikasikalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MenghitungPersegi extends AppCompatActivity {

    private Button btnHasilPersegi;
    private EditText txt_sisi;
    private TextView hasilLuasPersegi;
    private TextView hasilKelilingPersegi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menghitung_persegi);

        btnHasilPersegi = findViewById(R.id.calculate_persegi);
        txt_sisi = findViewById(R.id.sisi);
        hasilLuasPersegi = findViewById(R.id.hasil_luas_persegi);
        hasilKelilingPersegi = findViewById(R.id.hasil_keliling_persegi);

        btnHasilPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilai = txt_sisi.getText().toString();

                if(nilai.isEmpty()){
                    txt_sisi.setError("Data Tidak Boleh Kosong");
                    txt_sisi.requestFocus();
                }
                else{
                    Integer sisi = Integer.parseInt(nilai);

                    Integer luas = sisi*sisi;
                    hasilLuasPersegi.setText(String.valueOf(luas));

                    Integer keliling = sisi+sisi+sisi+sisi;
                    hasilKelilingPersegi.setText(String.valueOf(keliling));
                }
            }
        });
    }
}