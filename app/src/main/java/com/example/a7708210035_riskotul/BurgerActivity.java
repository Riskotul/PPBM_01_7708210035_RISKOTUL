package com.example.a7708210035_riskotul;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.RatingBar;

public class BurgerActivity extends AppCompatActivity {
    private ImageView foodImage;
    private TextView foodDescription;
    private RatingBar foodRating;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burger);

        foodImage = findViewById(R.id.foodImageBurger);
        foodDescription = findViewById(R.id.foodDescriptionBurger);
        foodRating = findViewById(R.id.foodRatingBurger);

        // Set gambar makanan
        foodImage.setImageResource(R.drawable.burger);

        // Set deskripsi makanan
        foodDescription.setText("Tutup mata Anda dan bayangkan gigitan pertama ke dalam burger yang juicy dan lezat dengan daging panggang yang gurih, saus istimewa, dan sentuhan kres kres dari sayuran segar, itulah definisi burger kenikmatan sejati.");

        // Set peringkat makanan
        foodRating.setRating(4.5f);
    }
}