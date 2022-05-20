package com.example.login;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LASTPAGE extends AppCompatActivity {
    TextView tq, wish;
    ImageView tku;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lastpage);
        tq = (TextView) findViewById(R.id.tq);
        wish = (TextView) findViewById(R.id.wish);
        tku = (ImageView) findViewById(R.id.tku);
    }
}
