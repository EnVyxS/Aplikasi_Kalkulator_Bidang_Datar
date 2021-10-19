package com.example.aplikasikalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MenghitungLingkaran extends AppCompatActivity {

    private Button btnHasilLingkaran;
    private EditText txt_Diameter;
    private TextView hasilLuasLingkaran;
    private TextView hasilKelilingLingkaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menghitung_lingkaran);

        btnHasilLingkaran = findViewById(R.id.calculate_Lingkaran);
        txt_Diameter = findViewById(R.id.diameter);
        hasilLuasLingkaran = findViewById(R.id.hasil_luas_lingkaran);
        hasilKelilingLingkaran = findViewById(R.id.hasil_keliling_lingkaran);

        btnHasilLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilai = txt_Diameter.getText().toString();

                if(nilai.isEmpty()){
                    txt_Diameter.setError("Data Tidak Boleh Kosong");
                    txt_Diameter.requestFocus();
                }
                else{
                    Integer diameter = Integer.parseInt(nilai);

                    Double luas = 0.25*3.14*(diameter*diameter);
                    hasilLuasLingkaran.setText(String.valueOf(luas));

                    Double keliling = 3.14*diameter;
                    hasilKelilingLingkaran.setText(String.valueOf(keliling));





                }
            }
        });
    }
}