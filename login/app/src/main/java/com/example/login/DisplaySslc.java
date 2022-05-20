package com.example.login;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DisplaySslc extends AppCompatActivity {
    Button Finish;
    TextView s,textView;
    Context context;
    SQLiteHelper myDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sslcc);
        myDB =new SQLiteHelper(this);
        Finish = (Button) findViewById(R.id.btnsslc);
        s = (TextView) findViewById(R.id.s);
        textView=(TextView)findViewById(R.id.sscltxt);
        display();
        Finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DisplaySslc.this, view.class);
                startActivity(intent);
            }
        });
    }

    private void display() {
        Cursor result = myDB.getAllDetail();
        while (result.moveToNext())
        {
            textView.append("\n\t"+result.getString(1));
            textView.append("\t\t"+result.getString(2));
            textView.append("\t\t"+result.getString(3));
            textView.append("\t\t"+result.getString(4));
            textView.append("\t\t"+result.getString(5));
            textView.append("\t\t"+result.getString(6)+"\n");
        }
    }
}
