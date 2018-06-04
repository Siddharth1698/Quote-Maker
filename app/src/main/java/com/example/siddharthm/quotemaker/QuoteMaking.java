package com.example.siddharthm.quotemaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class QuoteMaking extends AppCompatActivity {
    EditText e;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quote_making);
        e = (EditText)findViewById(R.id.editText);
        b = (Button)findViewById(R.id.button15);
        final String s = e.getText().toString();
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),FinalScreen.class);
                i.putExtra("quote",s);
                startActivity(i);
            }
        });

    }
}
