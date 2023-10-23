package com.example.a7708210035_riskotul;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomeActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);

        // Temukan ImageView Anda berdasarkan ID
        ImageView bahasaImage = findViewById(R.id.ImageViewBahasa);

        // Tambahkan OnClickListener ke gambar bahasa
        bahasaImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ketika gambar bahasa diklik, pindah ke halaman bahasa
                Intent intent = new Intent(HomeActivity2.this, BahasaActivity.class);
                startActivity(intent);
            }
        });

        // Tambahkan OnClickListener untuk halaman utama
        ImageView homeImage = findViewById(R.id.ImageViewHome);
        homeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ketika gambar halaman utama diklik, pindah kembali ke halaman utama
                Intent intent = new Intent(HomeActivity2.this, HomeActivity.class);
                startActivity(intent);
            }
        });


        // Tambahkan OnClickListener untuk halaman utama
        ImageView developerImage = findViewById(R.id.ImageViewDeveloper);
        developerImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ketika gambar halaman utama diklik, pindah kembali ke halaman utama
                Intent intent = new Intent(HomeActivity2.this, DeveloperActivity.class);
                startActivity(intent);
            }
        });


        // Tambahkan OnClickListener untuk halaman utama
        ImageView orangImage = findViewById(R.id.ImageViewOrang);
        orangImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ketika gambar halaman utama diklik, pindah kembali ke halaman utama
                Intent intent = new Intent(HomeActivity2.this, ProfilActivity.class);
                startActivity(intent);
            }
        });
    }
}