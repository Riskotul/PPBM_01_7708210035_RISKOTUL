package com.example.a7708210035_riskotul;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.RatingBar;

public class DalgonaActivity extends AppCompatActivity {
    private ImageView foodImage;
    private TextView foodDescription;
    private RatingBar foodRating;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dalgona);

        foodImage = findViewById(R.id.foodImageDalgona);
        foodDescription = findViewById(R.id.foodDescriptionDalgona);
        foodRating = findViewById(R.id.foodRatingDalgona);

        // Set gambar makanan
        foodImage.setImageResource(R.drawable.dalgonacoffe);

        // Set deskripsi makanan
        foodDescription.setText("Dalgona coffee adalah minuman kopi yang terdiri dari campuran bubuk kopi, gula, dan air panas yang dikocok hingga menghasilkan busa kental yang lezat, kemudian disajikan di atas susu dingin, menciptakan lapisan kontras antara kopi pekat dan susu yang nikmat.");

        // Set peringkat makanan
        foodRating.setRating(4.0f);
    }
}