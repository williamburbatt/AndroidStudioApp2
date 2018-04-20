package com.example.williamburbatt.androidstudioapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Recipes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);



    }
    public void onClick(View v) {
        startActivity(new Intent(Recipes.this, RecipePage.class));

    }
}
