package com.example.a7708210035_riskotul;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.RatingBar;

public class EstehActivity extends AppCompatActivity {
    private ImageView foodImage;
    private TextView foodDescription;
    private RatingBar foodRating;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esteh);

        foodImage = findViewById(R.id.foodImageEsteh);
        foodDescription = findViewById(R.id.foodDescriptionEsteh);
        foodRating = findViewById(R.id.foodRatingEsteh);

        // Set gambar makanan
        foodImage.setImageResource(R.drawable.esteh);

        // Set deskripsi makanan
        foodDescription.setText("Es teh adalah minuman segar yang terbuat dari teh dingin yang diberi es batu dan pemanis, seringkali dihidangkan dengan potongan jeruk atau hiasan lainnya.");

        // Set peringkat makanan
        foodRating.setRating(5.0f);
    }
}