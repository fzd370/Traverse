package com.example.traverse;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class Jaipur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jaipur);

        CardView cardView = (CardView)findViewById(R.id.jplaces);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Jaipur.this,places_jaipur.class);
                startActivity(intent);}
        });

        CardView cardView2 = (CardView)findViewById(R.id.card2);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Jaipur.this,food_jaipur.class);
                startActivity(intent);}
        });

        CardView cardView3 = (CardView)findViewById(R.id.card3);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Jaipur.this,people_jaipur.class);
                startActivity(intent);
            }
        });

        CardView cardView4 = (CardView)findViewById(R.id.card4);
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Jaipur.this,moments_jaipur.class);
                startActivity(intent);
            }
        });
    }
}
