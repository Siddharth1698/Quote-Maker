package com.example.siddharthm.quotemaker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FinalScreen extends AppCompatActivity {
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_screen);
        t = (TextView)findViewById(R.id.textView);
        Bundle extras = getIntent().getExtras();
        String quoteq = extras.getString("quote");
        t.setText(quoteq);

    }
}
