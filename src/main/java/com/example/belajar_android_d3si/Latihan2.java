package com.example.belajar_android_d3si;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Latihan2 extends AppCompatActivity {

    //deklarasi
    private EditText code_txtNama, code_txtBilangan;
    private Button code_btnTampil, code_btnCek;
    private TextView code_labelHasil;
    private TextView code_labelHasilBilangan;
    private String hasil = "";
    private int bil = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan2);

        //konfigurasi
        code_txtNama = (EditText) findViewById(R.id.txtNama);
        code_btnTampil = (Button)findViewById(R.id.btnTampil);
        code_labelHasil = (TextView) findViewById(R.id.labelHasil);

        code_txtBilangan = (EditText) findViewById(R.id.txtBilangan);
        code_btnCek = (Button)findViewById(R.id.btnCek);
        code_labelHasilBilangan =
                (TextView) findViewById(R.id.labelHasilBilangan);

        //ketika btnTampil diklik
        code_btnTampil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil = "Hello " + code_txtNama.getText();
                code_labelHasil.setText(hasil);
            }
        });

        //ketika btnCek diklik
        code_btnCek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //parsing nilainya ke integer
                bil = Integer.parseInt(code_txtBilangan.getText().toString());
                //cek bilangan
                if (bil % 2 == 0)
                {
                    hasil = "Bilangan " + bil + " adalah bilangan genap";
                }
                else
                {
                    hasil = "Bilangan " + bil + " adalah bilangan ganjil";
                }

                code_labelHasilBilangan.setText(hasil);
            }
        });






    }
}