package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity
{
    String EmailHolder;
    TextView Email;
    Button LogOUT ;
    Button Next;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Email = (TextView)findViewById(R.id.textView1);
        LogOUT = (Button)findViewById(R.id.button1);
        Next = (Button)findViewById(R.id.button2);
        Intent intent = getIntent();
        // Receiving User Email Send By MainActivity.
        EmailHolder = intent.getStringExtra(MainActivity.UserEmail);
        // Setting up received email to TextView.
        Email.setText(Email.getText().toString()+EmailHolder);
        // Adding click listener to Log Out button.
        LogOUT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Finishing current DashBoard activity on button click.
                finish();
                Toast.makeText(DashboardActivity.this,"Log Out Successful", Toast.LENGTH_LONG).show();
            }
        });
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                    Intent intent = new Intent(DashboardActivity.this, Form.class);
                    startActivity(intent);
            }
        });
    }
}