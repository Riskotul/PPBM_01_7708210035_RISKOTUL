package com.example.a7708210035_riskotul;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class registrasiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);

        Button signup_btn = findViewById(R.id.btn_signup);
        // 2. gunakan button yang sudah ada di .java ---> signup_btn
        signup_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent _intent = new Intent(registrasiActivity.this, LoginActivity.class);
                startActivity(_intent);
            }
        });

        Button login_btn = findViewById(R.id.btn_login);
        // 2. gunakan button yang sudah ada di .java ---> signup_btn
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent _intent = new Intent(registrasiActivity.this, LoginActivity.class);
                startActivity(_intent);
            }
        });
    }

}