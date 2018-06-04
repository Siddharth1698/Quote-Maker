package com.example.siddharthm.quotemaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ColorSelection extends AppCompatActivity {
    Button white;
    Button gray;
    Button lightblue;
    Button blue;
    Button green;
    Button lightgreen;
    Button orange;
    Button lightorange;
    Button purple;
    Button red;
    Button lightred;
    Button black;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_selection);
        white = (Button)findViewById(R.id.button2);
        gray = (Button)findViewById(R.id.button3);
        lightblue = (Button)findViewById(R.id.button4);
        blue = (Button)findViewById(R.id.button6);
        green = (Button)findViewById(R.id.button7);
        lightgreen = (Button)findViewById(R.id.button8);
        orange = (Button)findViewById(R.id.button9);
        lightorange = (Button)findViewById(R.id.button10);
        purple = (Button)findViewById(R.id.button11);
        red = (Button)findViewById(R.id.button12);
        lightred = (Button)findViewById(R.id.button13);
        black = (Button)findViewById(R.id.button14);

        white.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),QuoteMaking.class);
                i.putExtra("color","white");
                startActivity(i);
            }
        });

    }
}
