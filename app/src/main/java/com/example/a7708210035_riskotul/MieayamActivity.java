package com.example.a7708210035_riskotul;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.RatingBar;

public class MieayamActivity extends AppCompatActivity {
    private ImageView foodImage;
    private TextView foodDescription;
    private RatingBar foodRating;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mieayam);

        foodImage = findViewById(R.id.foodImageMieayam);
        foodDescription = findViewById(R.id.foodDescriptionMieayam);
        foodRating = findViewById(R.id.foodRatingMieayam);

        // Set gambar makanan
        foodImage.setImageResource(R.drawable.mieayam);

        // Set deskripsi makanan
        foodDescription.setText("Mie Ayam adalah hidangan Indonesia yang terdiri dari mie pangsit dengan potongan daging ayam, kuah kaldu gurih, dan sayuran segar.");

        // Set peringkat makanan
        foodRating.setRating(5.0f);
    }
}