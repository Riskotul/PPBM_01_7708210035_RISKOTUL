package com.example.a7708210035_riskotul;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ImageView;


public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        //MAKANAN
        final CheckBox makanan1 = findViewById(R.id.burger);
        final CheckBox makanan2 = findViewById(R.id.mieayam);
        final CheckBox makanan3 = findViewById(R.id.pizza);

        //MINUMAN
        final CheckBox minuman1 = findViewById(R.id.esteh);
        final CheckBox minuman2 = findViewById(R.id.jus);
        final CheckBox minuman3 = findViewById(R.id.dalgonacoffe);

        //KEVIN RAHAKBAUW
        //TIF RM20
        //MOBILE PROGRAMING 1

        //JUMLAH MAKANAN
        final EditText jml_mkn1 = findViewById(R.id.jumlahburger);
        final EditText jml_mkn2 = findViewById(R.id.jumlahmieayam);
        final EditText jml_mkn3 = findViewById(R.id.jumlahpizza);

        //JUMLAH MINUMAN
        final EditText jml_min1 = findViewById(R.id.jumlahesteh);
        final EditText jml_min2 = findViewById(R.id.jumlahjus);
        final EditText jml_min3 = findViewById(R.id.jumlahdalgonacoffe);
        Button btn = findViewById(R.id.submit);

        //HARGA MAKANAN
        final int harga_burger= 25000;
        final int harga_mieayam = 15000;
        final int harga_pizza = 35000;

        //HARGA MINUMAN
        final int harga_esteh = 5000;
        final int harga_jus = 10000;
        final int harga_dalgonacoffe= 15000;

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (!makanan1.isChecked() && !makanan2.isChecked() && !makanan3.isChecked() && !minuman1.isChecked() && !minuman2.isChecked() && !minuman3.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Silahkan Pilih Makanan dan Minuman", Toast.LENGTH_SHORT).show();
                } else {
                    String text = "";
                    int totOrder = 0;
                    int discount = 0;
                    if (makanan1.isChecked()) {
                        String hasil = "Burger ";
                        int jml = Integer.parseInt(String.valueOf(jml_mkn1.getText()));
                        int cal = jml * harga_burger;
                        text += jml + "\t\t" + hasil + "\t\t\t\t\t\t\t\t\t" + "Rp. " + cal + "\n\n";
                        totOrder = totOrder + cal;

                    }
                    if (makanan2.isChecked()) {
                        String hasil = "Mie Ayam ";
                        int jml = Integer.parseInt(String.valueOf(jml_mkn2.getText()));
                        int cal = jml * harga_mieayam;
                        text += jml + "\t\t" + hasil + "\t\t\t\t\t\t\t\t\t" + "Rp. " + cal + "\n\n";
                        totOrder = totOrder + cal;
                    }
                    if (makanan3.isChecked()) {
                        String hasil = "Pizza ";
                        int jml = Integer.parseInt(String.valueOf(jml_mkn3.getText()));
                        int cal = jml * harga_pizza;
                        text += jml + "\t\t" + hasil + "\t\t\t\t\t\t\t\t\t" + "Rp. " + cal + "\n\n";
                        totOrder = totOrder + cal;
                    }

                    //MINUMAN

                    if (minuman1.isChecked()) {
                        String hasil = "Ice Tea ";
                        int jml = Integer.parseInt(String.valueOf(jml_min1.getText()));
                        int cal = jml * harga_esteh;
                        text += jml + "\t\t" + hasil + "\t\t\t\t\t\t\t\t\t" + "Rp. " + cal + "\n\n";
                        totOrder = totOrder + cal;
                    }
                    if (minuman2.isChecked()) {
                        String hasil = "Juice Strawberry ";
                        int jml = Integer.parseInt(String.valueOf(jml_min2.getText()));
                        int cal = jml * harga_jus;
                        text += jml + "\t\t" + hasil + "\t\t\t\t\t\t\t\t\t" + "Rp. " + cal + "\n\n";
                        totOrder = totOrder + cal;
                    }
                    if (minuman3.isChecked()) {
                        String hasil = "Dalgona Coffe";
                        int jml = Integer.parseInt(String.valueOf(jml_min3.getText()));
                        int cal = jml * harga_dalgonacoffe;
                        text += jml + "\t\t" + hasil + "\t\t\t\t\t\t\t\t\t" + "Rp. " + cal + "\n\n";
                        totOrder = totOrder + cal;
                    }
                    if (totOrder > 100000) {
                        discount = 10000;
                    }
                    Intent intent = new Intent(HomeActivity.this, RiwayatActivity.class);
                    intent.putExtra("Coba", text);
                    intent.putExtra("Bayar", totOrder);
                    startActivity(intent);
                }
            }

        });

        // Tambahkan OnClickListener untuk halaman utama
        ImageView burgerImage = findViewById(R.id.ImageViewBurger);
        burgerImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ketika gambar halaman utama diklik, pindah kembali ke halaman utama
                Intent intent = new Intent(HomeActivity.this, BurgerActivity.class);
                startActivity(intent);
            }
        });

        // Tambahkan OnClickListener untuk halaman utama
        ImageView mieayamImage = findViewById(R.id.ImageViewMieayam);
        mieayamImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ketika gambar halaman utama diklik, pindah kembali ke halaman utama
                Intent intent = new Intent(HomeActivity.this, MieayamActivity.class);
                startActivity(intent);
            }
        });


        // Tambahkan OnClickListener untuk halaman utama
        ImageView pizzaImage = findViewById(R.id.ImageViewPizza);
        pizzaImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ketika gambar halaman utama diklik, pindah kembali ke halaman utama
                Intent intent = new Intent(HomeActivity.this, PizzaActivity.class);
                startActivity(intent);
            }
        });


        // Tambahkan OnClickListener untuk halaman utama
        ImageView estehImage = findViewById(R.id.ImageViewEsteh);
        estehImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ketika gambar halaman utama diklik, pindah kembali ke halaman utama
                Intent intent = new Intent(HomeActivity.this, EstehActivity.class);
                startActivity(intent);
            }
        });


        // Tambahkan OnClickListener untuk halaman utama
        ImageView jusImage = findViewById(R.id.ImageViewJus);
        jusImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ketika gambar halaman utama diklik, pindah kembali ke halaman utama
                Intent intent = new Intent(HomeActivity.this, JusActivity.class);
                startActivity(intent);
            }
        });


        // Tambahkan OnClickListener untuk halaman utama
        ImageView dalgonaImage = findViewById(R.id.ImageViewDalgona);
        dalgonaImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ketika gambar halaman utama diklik, pindah kembali ke halaman utama
                Intent intent = new Intent(HomeActivity.this, DalgonaActivity.class);
                startActivity(intent);
            }
        });
    }
}