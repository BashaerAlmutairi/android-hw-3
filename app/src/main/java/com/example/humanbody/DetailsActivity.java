package com.example.humanbody;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Bundle deliveredshape =getIntent().getExtras();
        ImageView shapeimg= findViewById(R.id.imageView);
        TextView Name = findViewById(R.id.name);
        TextView Price =findViewById(R.id.price);
        humanbody currentShape= (humanbody) deliveredshape.getSerializable("currentshape");

        shapeimg.setImageResource(currentShape.getItemImage());
        Name.setText(currentShape.getItemName());
        Price.setText(currentShape.getItemPrice()+"");

    }
}