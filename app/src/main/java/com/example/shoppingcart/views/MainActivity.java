package com.example.shoppingcart.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

import com.example.shoppingcart.Activities.Boisson_Class;
import com.example.shoppingcart.Activities.Dessert_Class;
import com.example.shoppingcart.Activities.Entree_Class;
import com.example.shoppingcart.Activities.Plat_principal_Class;
import com.example.shoppingcart.R;

public class MainActivity extends AppCompatActivity {

    GridLayout gridLayout;
    CardView cardView1, cardView2, cardView3, cardView4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridLayout = (GridLayout) findViewById(R.id.mainGrid);
        cardView1 = (CardView) findViewById(R.id.item1);
        cardView2 = (CardView) findViewById(R.id.item2);
        cardView3 = (CardView) findViewById(R.id.item3);
        cardView4 = (CardView) findViewById(R.id.item4);


        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Entree_Class.class));
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Plat_principal_Class.class));
            }
        });

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Dessert_Class.class));
            }
        });

        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Boisson_Class.class));
            }
        });
    }
}