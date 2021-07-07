package com.agung.sedated;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.util.TypedValue;

public class DataTanaman extends AppCompatActivity {
    private TextView desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_penyakit);
        desc = findViewById(R.id.dekripsi);
        showData();
    }
    @SuppressLint("SetTextI18n")
    private void showData(){
        //Mendapatkan Nama Mahasiswa dari Activity sebelumnya
        String nama = getIntent().getExtras().getString("MyName");

        //Menentukan identitas yang ditampilkan bedasarkan nama yang dipilih
        switch (nama){

        }
    }
}