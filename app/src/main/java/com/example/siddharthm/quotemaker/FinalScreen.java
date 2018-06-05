package com.example.siddharthm.quotemaker;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FinalScreen extends AppCompatActivity {
    TextView t;
    LinearLayout l;
    String colorr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_screen);
        t = (TextView) findViewById(R.id.textView);
        l = (LinearLayout) findViewById(R.id.lay);
        Bundle extras = getIntent().getExtras();
        String quoteq = extras.getString("quote");
        colorr = extras.getString("color");

        t.setText(quoteq);
        if (colorr.equals("gray")) {
            l.setBackgroundColor(Color.GRAY);
        }
        if (colorr.equals("red")) {
            l.setBackgroundColor(Color.RED);
        }
        if (colorr.equals("green")) {
            l.setBackgroundColor(Color.GREEN);
        }
        if (colorr.equals("blue")) {
            l.setBackgroundColor(Color.BLUE);
        }
        if (colorr.equals("yellow")) {
            l.setBackgroundColor(Color.YELLOW);
        }
        if(colorr.equals("magenta")){
            l.setBackgroundColor(Color.MAGENTA);
        }
        if(colorr.equals("cyan")){
            l.setBackgroundColor(Color.CYAN);
        }
        if(colorr.equals("dkgray")){
            l.setBackgroundColor(Color.DKGRAY);
        }
        if (colorr.equals("black")){
            l.setBackgroundColor(Color.BLACK);
            t.setTextColor(Color.WHITE);
        }
        if(colorr.equals("ltgray")){
            l.setBackgroundColor(Color.LTGRAY);
        }

    }
}
