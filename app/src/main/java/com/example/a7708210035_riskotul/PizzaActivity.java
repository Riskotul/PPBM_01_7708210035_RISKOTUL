package com.example.a7708210035_riskotul;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.RatingBar;

public class PizzaActivity extends AppCompatActivity {
    private ImageView foodImage;
    private TextView foodDescription;
    private RatingBar foodRating;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);

        foodImage = findViewById(R.id.foodImagePizza);
        foodDescription = findViewById(R.id.foodDescriptionPizza);
        foodRating = findViewById(R.id.foodRatingPizza);

        // Set gambar makanan
        foodImage.setImageResource(R.drawable.pizza);

        // Set deskripsi makanan
        foodDescription.setText("Pizza adalah hidangan lezat yang terdiri dari adonan bulat yang ditutupi dengan saus tomat, keju, dan berbagai macam topping, lalu dipanggang hingga keemasan, menciptakan perpaduan cita rasa yang gurih, manis, dan lezat.");

        // Set peringkat makanan
        foodRating.setRating(4.0f);
    }
}