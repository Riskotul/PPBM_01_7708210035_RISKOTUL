package com.example.a7708210035_riskotul;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    private static final int SPLASH_DISPLAY_LENGTH = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Intent untuk berpindah ke MainActivity (atau halaman tujuan Anda)
                Intent mainIntent = new Intent(MainActivity.this, registrasiActivity.class);
                startActivity(mainIntent);
                finish(); // Menutup activity ini
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}