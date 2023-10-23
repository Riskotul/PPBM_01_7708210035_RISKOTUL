package com.example.a7708210035_riskotul;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class BahasaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bahasa);

        // Inisialisasi data spinner
        String[] bahasa = {"Bahasa Indonesia", "English", "Español", "Français", "Deutsch", "日本語"};

        // Inisialisasi spinner
        Spinner spinner = findViewById(R.id.spinner);

        // Inisialisasi adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, bahasa);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Menghubungkan adapter dengan spinner
        spinner.setAdapter(adapter);

        // Menambahkan penanganan pilihan spinner
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // Tindakan yang diambil saat pengguna memilih item
                String selectedLanguage = bahasa[position];
                Toast.makeText(BahasaActivity.this, "Anda memilih: " + selectedLanguage, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // Tindakan yang diambil ketika tidak ada yang dipilih
            }
        });
    }
}
