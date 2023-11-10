package com.sar.muhammadrezkisetiawan_quis;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.sar.muhammadrezkisetiawan_quis.MainActivity;

public class MainActivity extends AppCompatActivity {
    EditText nilai_tugas, nilai_quis, nilai_uts, nilai_uas;

    int tugas,quis,uts,uas, nilai_akhir;
    Button proses, bersih;
    TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nilai_tugas = (EditText) findViewById(R.id.angka_pertama);
        nilai_quis = (EditText) findViewById(R.id.angka_kedua);
        nilai_uts = (EditText) findViewById(R.id.angka_ketiga);
        nilai_uas = (EditText) findViewById(R.id.angka_keempat);

        proses = (Button)findViewById(R.id.Hitung);
        bersih = (Button)findViewById(R.id.bersihkan);


        hasil = (TextView) findViewById(R.id.hasil);

        proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tugas=Integer.valueOf(nilai_tugas.getText().toString());
                tugas*=20;
                tugas/=100;
                quis=Integer.valueOf(nilai_quis.getText().toString());
                quis*=20;
                quis/=100;
                uts=Integer.valueOf(nilai_uts.getText().toString());
                uts*=30;
                uts/=100;
                uas=Integer.valueOf(nilai_uas.getText().toString());
                uas*=30;
                uas/=100;
                nilai_akhir = tugas+quis+uts+uas;
                hasil.setText(String.valueOf(nilai_akhir));
            }
        });



        bersih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilai_tugas.setText(null);
                nilai_quis.setText(null);
                nilai_uts.setText(null);
                nilai_uas.setText(null);
            }
        });




    }
}