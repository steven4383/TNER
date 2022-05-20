package com.example.login;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ugjob extends AppCompatActivity {
        Button Finish3;
        TextView ugjob,textView2;
        Context context;
        SQLiteHelper myDB1;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.ug);
            myDB1 =new SQLiteHelper(this);
            Finish3 = (Button) findViewById(R.id.but1);
            ugjob = (TextView) findViewById(R.id.ug1);
            textView2=(TextView)findViewById(R.id.ugtxt);
            display();
            Finish3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(ugjob.this, view.class);
                    startActivity(intent);
                }
            });
        }
    private void display() {
        Cursor result = myDB1.ugDetail();
        while (result.moveToNext())
        {
            textView2.append("\n\t"+result.getString(1));
            textView2.append("\t\t"+result.getString(2));
            textView2.append("\t\t"+result.getString(3));
            textView2.append("\t\t"+result.getString(4));
            textView2.append("\t\t"+result.getString(5));
            textView2.append("\t\t"+result.getString(6)+"\n");
        }
    }
}
