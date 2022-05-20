package com.example.login;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class HSS extends AppCompatActivity {
        Button Finish1;
        TextView h,textView1;
        Context context;
        SQLiteHelper myDBH;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.h);
            myDBH =new SQLiteHelper(this);
            Finish1 = (Button) findViewById(R.id.button4);
            h = (TextView) findViewById(R.id.h);
            textView1=(TextView)findViewById(R.id.hsstxt);
            display();
            Finish1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(HSS.this, view.class);
                    startActivity(intent);
                }
            });
        }
    private void display() {
        Cursor result = myDBH.AllDetail();
        while (result.moveToNext())
        {
            textView1.append("\n\t"+result.getString(1));
            textView1.append("\t\t"+result.getString(2));
            textView1.append("\t\t"+result.getString(3));
            textView1.append("\t\t"+result.getString(4));
            textView1.append("\t\t"+result.getString(5));
            textView1.append("\t\t"+result.getString(6)+"\n");
        }
    }
}