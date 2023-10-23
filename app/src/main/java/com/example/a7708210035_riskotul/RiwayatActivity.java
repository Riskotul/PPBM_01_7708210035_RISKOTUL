package com.example.a7708210035_riskotul;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.TextView;import android.widget.TextView;


public class RiwayatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riwayat);



        TextView text = findViewById(R.id.berhasil);
        TextView total1 = findViewById(R.id.total);
        TextView bel = findViewById(R.id.belanja);
        Intent intent = getIntent();
        String sum = intent.getStringExtra("Coba");

        int tot = intent.getIntExtra("Bayar", 0);
        int belanja = tot;
        text.setText(sum);
        total1.setText("Rp. " + tot);
        bel.setText("Rp. " + belanja);
    }
}