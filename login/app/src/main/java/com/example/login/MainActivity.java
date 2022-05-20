package com.example.login;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    Button LogInButton, RegisterButton,Admin;
    EditText Email, Password;
    ImageView img;
    String EmailHolder, PasswordHolder;
    Boolean EditTextEmptyHolder;
    SQLiteDatabase sqLiteDatabaseObj;
    SQLiteHelper sqLiteHelper;
    Cursor cursor;
    String TempPassword = "NOT_FOUND";
    public static final String UserEmail = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LogInButton = (Button) findViewById(R.id.buttonLogin);
        RegisterButton = (Button) findViewById(R.id.buttonRegister);
        Admin = (Button) findViewById(R.id.adbtn);
        Email = (EditText) findViewById(R.id.editEmail);
        Password = (EditText) findViewById(R.id.editPassword);
        img=(ImageView)findViewById(R.id.imageView);
        sqLiteHelper = new SQLiteHelper(this);
        //Adding click listener to log in button.
        LogInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Calling EditText is empty or no method.
                if(CheckEditTextStatus()) {
                    if(validation()) {
                        // Calling login method.
                        LoginFunction();
                        CheckFinalResult();
                    }
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Please Enter UserName or Password.", Toast.LENGTH_LONG).show();
                }
            }
        });
        // Adding click listener to register button.
        RegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Opening new user registration activity using intent on button click.
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        }
        );
        Admin.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View view) {
                      // Opening new user registration activity using inteant on button click.
                      Intent intent = new Intent(MainActivity.this, adminlog.class);
                      startActivity(intent);
                  }
              }
        );
    }
    // Login function starts from here.
    public void LoginFunction() {
        //if (EditTextEmptyHolder) {
            // Opening SQLite database write permission.
            sqLiteDatabaseObj = sqLiteHelper.getWritableDatabase();
            // Adding search email query to cursor.
            cursor = sqLiteDatabaseObj.query(SQLiteHelper.TABLE_NAME, null, " " + SQLiteHelper.Table_Column_2_Email + "=?", new String[]{EmailHolder}, null, null, null);
            while (cursor.moveToNext()) {
                if (cursor.isFirst()) {
                    cursor.moveToFirst();
                    // Storing Password associated with entered email.
                    TempPassword = cursor.getString(cursor.getColumnIndex(SQLiteHelper.Table_Column_3_Password));
                    // Closing cursor.
                    cursor.close();
                }
            }
            // Calling method to check final result ..
        //} else {
            //If any of login EditText empty then this block will be executed.
          //  Toast.makeText(MainActivity.this, "Please Enter UserName or Password.", Toast.LENGTH_LONG).show();
            //CheckFinalResult();
        //}
    }
    public boolean validation() {
        String email = Email.getText().toString().trim();
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        if (email.matches(emailPattern))
        {
            return true;
        }
        else {
            Toast.makeText(getApplicationContext(), "Invalid email address", Toast.LENGTH_SHORT).show();
            return false;
        }
    }
     // Checking EditText is empty or not.
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
    // Checking entered password from SQLite database email associated password.
    public void CheckFinalResult () {
        if (TempPassword.equalsIgnoreCase(PasswordHolder))
        {
                Email.getText().clear();
                Password.getText().clear();
            Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_LONG).show();
            // Going to Dashboard activity after login success message.
            Intent intent = new Intent(MainActivity.this, DashboardActivity.class);
            // Sending Email to Dashboard Activity using intent.
            intent.putExtra(UserEmail, EmailHolder);
            startActivity(intent);
        } else {
            Toast.makeText(MainActivity.this, "UserName or Password is Wrong, Please Try Again.", Toast.LENGTH_LONG).show();
        }
            TempPassword = "NOT_FOUND";
     }
}