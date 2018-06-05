package com.example.siddharthm.quotemaker;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FinalScreen extends AppCompatActivity {
    TextView t;
    LinearLayout l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_screen);
        t = (TextView)findViewById(R.id.textView);
        l = (LinearLayout)findViewById(R.id.lay);
        Bundle extras = getIntent().getExtras();
        String quoteq = extras.getString("quote");
        String colorr = extras.getString("color");
        t.setText(quoteq);
        if(colorr == "gray") {
            l.setBackgroundColor(Color.GRAY);
        }


        }
}
