package com.example.a7708210035_riskotul;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.RatingBar;

public class JusActivity extends AppCompatActivity {
    private ImageView foodImage;
    private TextView foodDescription;
    private RatingBar foodRating;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jus);

        foodImage = findViewById(R.id.foodImageJus);
        foodDescription = findViewById(R.id.foodDescriptionJus);
        foodRating = findViewById(R.id.foodRatingJus);

        // Set gambar makanan
        foodImage.setImageResource(R.drawable.jus);

        // Set deskripsi makanan
        foodDescription.setText("Jus stroberi adalah minuman berbahan dasar jus segar dari buah stroberi yang memiliki rasa manis, asam, dan segar, dengan warna merah cerah yang menggoda, seringkali disajikan dalam berbagai penyajian yang menyegarkan seperti dingin atau dengan tambahan es.");

        // Set peringkat makanan
        foodRating.setRating(4.0f);
    }
}