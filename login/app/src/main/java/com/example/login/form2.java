package com.example.login;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class form2 extends AppCompatActivity {
    EditText name,course, degree, college, per,phone;
    Button next;
    String nameHolder,courseHolder, degHolder, clgHolder, perHolder,phoneHolder;
    Boolean EditTextEmptyHolder;
    SQLiteDatabase sqLiteDatabaseObj;
    String SQLiteDataBaseQueryHolder;
    SQLiteHelper sqLiteHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_form2);
        next = (Button) findViewById(R.id.nextbtn);
        name=(EditText) findViewById(R.id.nnnn);
        course = (EditText) findViewById(R.id.qual);
        degree = (EditText) findViewById(R.id.edittxt1);
        college = (EditText) findViewById(R.id.edittxt2);
        per = (EditText) findViewById(R.id.edittxt3);
        phone = (EditText) findViewById(R.id.phone);
        sqLiteHelper = new SQLiteHelper(this);
        // Adding click listener to register button.
        next.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Creating SQLite database if dose n't exists
                SQLiteDataBaseBuild();
                // Creating SQLite table if dose n't exists.
                SQLiteTableBuild();
                // Checking EditText is empty or Not.
                CheckEditTextStatus();
                // Method to check Email is already exists or not.
                InsertDataIntoSQLiteDatabase();
                // Empty EditText After done inserting process.
                EmptyEditTextAfterDataInsert();
            }
        });
    }
    // SQLite database build method.
    public void SQLiteDataBaseBuild() {
        sqLiteDatabaseObj = openOrCreateDatabase(SQLiteHelper.DATABASE_NAME, Context.MODE_PRIVATE, null);
    }
    // SQLite table build method.
    public void SQLiteTableBuild()
    {
        sqLiteDatabaseObj.execSQL("CREATE TABLE IF NOT EXISTS " + SQLiteHelper.TABLE_NAME2 + "(" + SQLiteHelper.Table_Column_ID2 + " PRIMARY KEY AUTOINCREMENT NOT NULL," + SQLiteHelper.Table_Column_18_name + " VARCHAR," + SQLiteHelper.Table_Column_19_course + " VARCHAR," + SQLiteHelper.Table_Column_20_deg+ " VARCHAR," + SQLiteHelper.Table_Column_21_clg + " VARCHAR," + SQLiteHelper.Table_Column_22_per + " INTEGER,"+SQLiteHelper.Table_Column_23_phone + " INTEGER)");
    }
    // Insert data into SQLite database method.
    public void InsertDataIntoSQLiteDatabase() {
        // If editText is not empty then this block will executed.
        if (EditTextEmptyHolder) {
            // SQLite query to insert data into table.
            SQLiteDataBaseQueryHolder = "INSERT INTO " + SQLiteHelper.TABLE_NAME2 + " (name,course,degree,college,per,phone) VALUES ('" + nameHolder + "','" + courseHolder + "', '" + degHolder + "', '" + clgHolder + "','" + perHolder + "','" + phoneHolder + "')";
            // Executing query.
            sqLiteDatabaseObj.execSQL(SQLiteDataBaseQueryHolder);
            // Closing SQLite database object.
            sqLiteDatabaseObj.close();
            // Printing toast message after done inserting.
            Toast.makeText(form2.this, "Data entered Successfully", Toast.LENGTH_LONG).show();
            next();
        }
        // This block will execute if any of the registration EditText is empty.
        else {
            // Printing toast message if any of EditText is empty.
            Toast.makeText(form2.this, "Please Fill All The Required Fields.", Toast.LENGTH_LONG).show();
        }
    }
    // Empty edittext after done inserting process method.
    public void EmptyEditTextAfterDataInsert() {
        name.getText().clear();
        course.getText().clear();
        degree.getText().clear();
        college.getText().clear();
        per.getText().clear();
        phone.getText().clear();
    }
    // Method to check EditText is empty or Not.
    public void CheckEditTextStatus() {
        // Getting value from All EditText and storing into String Variables.
        nameHolder = name.getText().toString();
        courseHolder = course.getText().toString();
        degHolder = degree.getText().toString();
        clgHolder = college.getText().toString();
        perHolder = per.getText().toString();
        phoneHolder=phone.getText().toString();
        if (TextUtils.isEmpty(nameHolder)||TextUtils.isEmpty(courseHolder) || TextUtils.isEmpty(degHolder) || TextUtils.isEmpty(clgHolder) || TextUtils.isEmpty(perHolder)||TextUtils.isEmpty(phoneHolder)) {
            EditTextEmptyHolder = false;
        } else {
            EditTextEmptyHolder = true;
        }
        validation();
    }
    public boolean validation() {
        String phno= phone.getText().toString().trim();
        String phonepattern = "[0-9]+";
        if (phno.matches(phonepattern)&& phone.length() == 10)
        {

        }
        else {
            Toast.makeText(getApplicationContext(), "Invalid Phone Number", Toast.LENGTH_SHORT).show();
        }
        return true;
    }
    public void next()
    {
        Intent intent=new Intent(form2.this,job.class);
        startActivity(intent);
    }
}
