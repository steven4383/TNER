package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class adminlog extends AppCompatActivity {
    Button LogInButton;
    EditText Email, Password;
    String EmailHolder, PasswordHolder;
    Boolean EditTextEmptyHolder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adminlog);
        LogInButton = (Button) findViewById(R.id.buttonLogin);
        Email = (EditText) findViewById(R.id.editEmail);
        Password = (EditText) findViewById(R.id.editPassword);
        LogInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (CheckEditTextStatus()) {
                    if (validation()) {
                        course();
                    }
                }
                else
                {
                    Toast.makeText(adminlog.this, "Please Enter UserName or Password.", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
        public boolean CheckEditTextStatus()
        {
            // Getting value from All EditText and storing into String Variables.
            EmailHolder = Email.getText().toString();
            PasswordHolder = Password.getText().toString();
            // Checking EditText is empty or no using TextUtils.
            if (TextUtils.isEmpty(EmailHolder) || TextUtils.isEmpty(PasswordHolder))
            {
                EditTextEmptyHolder = false;
            }
            else
            {
                EditTextEmptyHolder = true;
            }
            return EditTextEmptyHolder;
        }
    public boolean validation() {
        String email = Email.getText().toString().trim();
        String emailPattern = "admin@gmail.com";
        String password =Password .getText().toString().trim();
        String passwordPattern= "admin";
        if (email.matches(emailPattern)&&password.matches(passwordPattern))
        {
            Toast.makeText(getApplicationContext(), "Login Successfull", Toast.LENGTH_SHORT).show();
            return true;
        }
        else {
            Toast.makeText(getApplicationContext(), "Please enter correct email address or password", Toast.LENGTH_SHORT).show();
            return false;
        }
    }
    public void course()
    {
        Intent intent=new Intent(adminlog.this,view.class);
        startActivity(intent);
    }
}