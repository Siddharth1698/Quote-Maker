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
        t = (TextView)findViewById(R.id.textView);
        l = (LinearLayout)findViewById(R.id.lay);
        Bundle extras = getIntent().getExtras();
        String quoteq = extras.getString("quote");
        colorr = extras.getString("color");

        t.setText(quoteq);
        if(colorr.equals("gray")) {
            l.setBackgroundColor(Color.GRAY);
        }
        if(colorr.equals("red")) {
            l.setBackgroundColor(Color.RED);
        }


        }
}
