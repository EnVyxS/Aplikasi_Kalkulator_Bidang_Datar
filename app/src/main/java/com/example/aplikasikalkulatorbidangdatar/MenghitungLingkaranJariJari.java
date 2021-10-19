package com.example.aplikasikalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MenghitungLingkaranJariJari extends AppCompatActivity {

    private Button btnHasilLingkaranJari;
    private EditText txt_Jari;
    private TextView hasilLuasLingkaranJari;
    private TextView hasilKelilingLingkaranJari;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menghitung_lingkaran_jari_jari);

        btnHasilLingkaranJari = findViewById(R.id.calculate_LingkaranJari);
        txt_Jari = findViewById(R.id.jari_jari);
        hasilLuasLingkaranJari = findViewById(R.id.hasil_luas_lingkaranJari);
        hasilKelilingLingkaranJari = findViewById(R.id.hasil_keliling_lingkaranJari);

        btnHasilLingkaranJari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilai = txt_Jari.getText().toString();

                if(nilai.isEmpty()){
                    txt_Jari.setError("Data Tidak Boleh Kosong");
                    txt_Jari.requestFocus();
                }
                else{
                    Integer jari = Integer.parseInt(nilai);

                    Double luas = 3.14*(jari*jari);
                    hasilLuasLingkaranJari.setText(String.valueOf(luas));

                    Double keliling = 2*3.14*jari;
                    hasilKelilingLingkaranJari.setText(String.valueOf(keliling));





                }
            }
        });
    }
}