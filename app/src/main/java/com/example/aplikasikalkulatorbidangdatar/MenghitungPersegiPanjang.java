package com.example.aplikasikalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MenghitungPersegiPanjang extends AppCompatActivity {

    private Button btnHasilPersegiPanjang;
    private EditText txt_panjang;
    private EditText txt_lebar;
    private TextView hasilLuasPersegiPanjang;
    private TextView hasilKelilingPersegiPanjang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menghitung_persegi_panjang);

        btnHasilPersegiPanjang = findViewById(R.id.calculate_persegiPanjang);
        txt_panjang = findViewById(R.id.panjang);
        txt_lebar = findViewById(R.id.lebar);
        hasilKelilingPersegiPanjang = findViewById(R.id.hasil_keliling_persegiPanjang);
        hasilLuasPersegiPanjang = findViewById(R.id.hasil_luas_persegiPanjang);

        btnHasilPersegiPanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilai1 = txt_panjang.getText().toString();
                String nilai2 = txt_lebar.getText().toString();

                if(nilai1.isEmpty()){
                    txt_panjang.setError("Data Tidak Boleh Kosong");
                    txt_panjang.requestFocus();
                }
                else if(nilai2.isEmpty()){
                    txt_lebar.setError("Data Tidak Boleh Kosong");
                    txt_lebar.requestFocus();
                }
                else{
                    Integer panjang = Integer.parseInt(nilai1);
                    Integer lebar = Integer.parseInt(nilai2);

                    Integer luas = panjang*lebar;
                    hasilLuasPersegiPanjang.setText(String.valueOf(luas));

                    Integer keliling = 2*(panjang+lebar);
                    hasilKelilingPersegiPanjang.setText(String.valueOf(keliling));
                }
            }
        });
    }
}