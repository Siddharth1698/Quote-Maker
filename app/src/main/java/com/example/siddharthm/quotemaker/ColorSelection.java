package com.example.siddharthm.quotemaker;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

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
    EditText editText;

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
        editText = (EditText)findViewById(R.id.editText);
        final LinearLayout l = (LinearLayout)findViewById(R.id.l);



        white.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editText.getText().toString();
                Intent i = new Intent(getApplicationContext(),FinalScreen.class);
                i.putExtra("color","white");
                i.putExtra("quote",s);
                startActivity(i);
            }
        });

        gray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s = editText.getText().toString();
                Intent i = new Intent(getApplicationContext(),FinalScreen.class);
                i.putExtra("color","gray");
                i.putExtra("quote",s);
                startActivity(i);
            }
        });

        lightblue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s = editText.getText().toString();
                Intent i = new Intent(getApplicationContext(),FinalScreen.class);
                i.putExtra("color","lightblue");
                i.putExtra("quote",s);
                startActivity(i);
            }
        });

        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editText.getText().toString();
                Intent i = new Intent(getApplicationContext(),FinalScreen.class);
                i.putExtra("color","blue");
                i.putExtra("quote",s);
                startActivity(i);
            }
        });

        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editText.getText().toString();
                Intent i = new Intent(getApplicationContext(),FinalScreen.class);
                i.putExtra("color","green");
                i.putExtra("quote",s);
                startActivity(i);
            }
        });

        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s = editText.getText().toString();
                Intent i = new Intent(getApplicationContext(),FinalScreen.class);
                i.putExtra("color","orange");
                i.putExtra("quote",s);
                startActivity(i);
            }
        });

        lightorange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s = editText.getText().toString();
                Intent i = new Intent(getApplicationContext(),FinalScreen.class);
                i.putExtra("color","lightorange");
                i.putExtra("quote",s);
                startActivity(i);
            }
        });

        purple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s = editText.getText().toString();
                Intent i = new Intent(getApplicationContext(),FinalScreen.class);
                i.putExtra("color","purple");
                i.putExtra("quote",s);
                startActivity(i);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s = editText.getText().toString();
                Intent i = new Intent(getApplicationContext(),FinalScreen.class);
                i.putExtra("color","red");
                i.putExtra("quote",s);
                startActivity(i);
            }
        });

        lightred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s = editText.getText().toString();
                Intent i = new Intent(getApplicationContext(),FinalScreen.class);
                i.putExtra("color","lightred");
                i.putExtra("quote",s);
                startActivity(i);
            }
        });

        lightgreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s = editText.getText().toString();
                Intent i = new Intent(getApplicationContext(),FinalScreen.class);
                i.putExtra("color","lightgreen");
                i.putExtra("quote",s);
                startActivity(i);
            }
        });

        black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s = editText.getText().toString();
                Intent i = new Intent(getApplicationContext(),FinalScreen.class);
                i.putExtra("color","black");
                i.putExtra("quote",s);
                startActivity(i);
            }
        });



    }
}
