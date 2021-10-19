package com.example.aplikasikalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MenghitungSegitigaSembarang extends AppCompatActivity {

    private Button btnHasilSegitigaSembarang;
    private EditText txt_sisiSegitiga1;
    private EditText txt_sisiSegitiga2;
    private EditText txt_sisiSegitiga3;
    private EditText txt_alas;
    private EditText txt_tinggi;

    private TextView hasilLuasSegitigaSembarang;
    private TextView hasilKelilingSegitigaSembarang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menghitung_segitiga_sembarang);

        btnHasilSegitigaSembarang = findViewById(R.id.calculate_SegitigaSembarang);
        txt_sisiSegitiga1 = findViewById(R.id.sisi_segitiga1);
        txt_sisiSegitiga2 = findViewById(R.id.sisi_segitiga2);
        txt_sisiSegitiga3 = findViewById(R.id.sisi_segitiga3);
        txt_alas = findViewById(R.id.alas1);
        txt_tinggi = findViewById(R.id.tinggi1);
        hasilKelilingSegitigaSembarang = findViewById(R.id.hasil_keliling_SegitigaSembarang);
        hasilLuasSegitigaSembarang = findViewById(R.id.hasil_luas_SegitigaSembarang);

        btnHasilSegitigaSembarang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilai1 = txt_sisiSegitiga1.getText().toString();
                String nilai2 = txt_sisiSegitiga2.getText().toString();
                String nilai3 = txt_sisiSegitiga3.getText().toString();
                String nilai4 = txt_alas.getText().toString();
                String nilai5 = txt_tinggi.getText().toString();


                if(nilai1.isEmpty()){
                    txt_sisiSegitiga1.setError("Data Tidak Boleh Kosong");
                    txt_sisiSegitiga1.requestFocus();
                }
                else if(nilai2.isEmpty()){
                    txt_sisiSegitiga2.setError("Data Tidak Boleh Kosong");
                    txt_sisiSegitiga2.requestFocus();
                }
                else if(nilai3.isEmpty()){
                    txt_sisiSegitiga3.setError("Data Tidak Boleh Kosong");
                    txt_sisiSegitiga3.requestFocus();
                }
                else if(nilai4.isEmpty()){
                    txt_alas.setError("Data Tidak Boleh Kosong");
                    txt_alas.requestFocus();
                }
                else if(nilai5.isEmpty()){
                    txt_tinggi.setError("Data Tidak Boleh Kosong");
                    txt_tinggi.requestFocus();
                }
                else{
                    Integer sisi1 = Integer.parseInt(nilai1);
                    Integer sisi2 = Integer.parseInt(nilai2);
                    Integer sisi3 = Integer.parseInt(nilai3);
                    Double alas = Double.parseDouble(nilai4);
                    Double tinggi = Double.parseDouble(nilai5);

                    Double luas = 0.5*(alas*tinggi);
                    hasilLuasSegitigaSembarang.setText(String.valueOf(luas));

                    Integer keliling = sisi1+sisi2+sisi3;
                    hasilKelilingSegitigaSembarang.setText(String.valueOf(keliling));
                }
            }
        });

    }
}