package com.example.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class view extends AppCompatActivity {
    Button ss,hss,ug,pg;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view);
        ss=(Button)findViewById(R.id.sslc1);
        hss=(Button)findViewById(R.id.hss);
        ug=(Button)findViewById(R.id.ug);
        pg=(Button)findViewById(R.id.pg);
        ss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(view.this,DisplaySslc.class);
                startActivity(intent);
            }
    });
        hss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(view.this,HSS.class);
                startActivity(intent);
            }
        });
        ug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(view.this,ugjob.class);
                startActivity(intent);
            }
        });
        pg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(view.this,pgjobs.class);
                startActivity(intent);
            }
        });
}
}
