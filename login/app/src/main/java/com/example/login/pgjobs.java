package com.example.login;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class pgjobs extends AppCompatActivity {
    Button Finishpg;
    TextView s1,textView3;
    Context context;
    SQLiteHelper myDBpg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pg);
        Finishpg = (Button) findViewById(R.id.button);
        s1 = (TextView) findViewById(R.id.pg1);
        myDBpg =new SQLiteHelper(this);
        textView3=(TextView)findViewById(R.id.pgtxt);
        display();
        Finishpg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pgjobs.this, view.class);
                startActivity(intent);
            }
        });
    }
    private void display() {
        Cursor result = myDBpg.pgDetail();
        while (result.moveToNext())
        {
            textView3.append("\n\t"+result.getString(1));
            textView3.append("\t\t"+result.getString(2));
            textView3.append("\t\t"+result.getString(3));
            textView3.append("\t\t"+result.getString(4));
            textView3.append("\t\t"+result.getString(5));
            textView3.append("\t\t"+result.getString(6)+"\n");
        }
    }
}
