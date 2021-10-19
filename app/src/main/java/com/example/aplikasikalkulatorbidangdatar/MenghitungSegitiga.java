package com.example.aplikasikalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MenghitungSegitiga extends AppCompatActivity {

    private Button btnHasilSegitiga;
    private EditText txt_sisiSegitiga;
    private EditText txt_alas;
    private EditText txt_tinggi;

    private TextView hasilLuasSegitiga;
    private TextView hasilKelilingSegitiga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menghitung_segitiga);

        btnHasilSegitiga = findViewById(R.id.calculate_Segitiga);
        txt_sisiSegitiga = findViewById(R.id.sisi_segitiga);
        txt_alas = findViewById(R.id.alas);
        txt_tinggi = findViewById(R.id.tinggi);
        hasilKelilingSegitiga = findViewById(R.id.hasil_keliling_Segitiga);
        hasilLuasSegitiga = findViewById(R.id.hasil_luas_Segitiga);

        btnHasilSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilai1 = txt_sisiSegitiga.getText().toString();
                String nilai2 = txt_alas.getText().toString();
                String nilai3 = txt_tinggi.getText().toString();


                if(nilai1.isEmpty()){
                    txt_sisiSegitiga.setError("Data Tidak Boleh Kosong");
                    txt_sisiSegitiga.requestFocus();
                }
                else if(nilai2.isEmpty()){
                    txt_alas.setError("Data Tidak Boleh Kosong");
                    txt_alas.requestFocus();
                }
                else if(nilai3.isEmpty()){
                    txt_tinggi.setError("Data Tidak Boleh Kosong");
                    txt_tinggi.requestFocus();
                }
                else{
                    Integer sisi = Integer.parseInt(nilai1);
                    Double alas = Double.parseDouble(nilai2);
                    Double tinggi = Double.parseDouble(nilai3);

                    Double luas = 0.5*(alas*tinggi);
                    hasilLuasSegitiga.setText(String.valueOf(luas));

                    Integer keliling = sisi+sisi+sisi;
                    hasilKelilingSegitiga.setText(String.valueOf(keliling));
                }
            }
        });
    }
}