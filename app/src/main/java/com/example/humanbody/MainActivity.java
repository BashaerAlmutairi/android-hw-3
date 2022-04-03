package com.example.humanbody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.Transliterator;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<humanbody> HBArray = new ArrayList<>();

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        humanbody hair = new humanbody("Hair (per inch)",R.drawable.hair,10);
        humanbody eyeball = new humanbody("Eyeball",R.drawable.eyeball,1500 );
        humanbody heart = new humanbody("Heart",R.drawable.heart,1000000 );
        HBArray.add(hair);
        HBArray.add(eyeball);
        HBArray.add(heart);
        ListView listView = findViewById(R.id.humanbody);
        HBAdapter hbAdapter = new HBAdapter(this, 0, HBArray);
        listView.setAdapter(hbAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick ( AdapterView<?> adapterView, View view, int position , long l ) {
              humanbody currentshape=HBArray.get(position);
                Intent detailsintent= new Intent(MainActivity.this,DetailsActivity.class);
                detailsintent.putExtra("currentshape",currentshape);
                startActivity(detailsintent);
            }
        });
    }
}