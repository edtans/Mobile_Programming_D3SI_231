package com.example.belajar_android_d3si;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

public class Latihan3_Toast extends AppCompatActivity {

    //deklarasi
    private Switch code_switchWifi;

    private Toast munculah;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan3_toast);

        //konfigurasi
        code_switchWifi = (Switch)findViewById(R.id.switchWifi);

        //ketika switchWifi dinyalakan
        code_switchWifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (code_switchWifi.isChecked())
                {
                    munculah = Toast.makeText(getApplicationContext(),
                            "Wifi nyala",
                            Toast.LENGTH_SHORT);
                    munculah.show();
                }
                else
                {
                    munculah = Toast.makeText(getApplicationContext(),
                            "Wifi mati",
                            Toast.LENGTH_LONG);
                    munculah.show();
                }
            }
        });





    }
}