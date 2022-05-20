package com.example.login;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Form extends AppCompatActivity
{
    EditText Name1,gender,Marital_status,Aadhaar,Fathername,dob,phno ;
    Button last;
    String NameHolder, genderHolder,Marital_statusHolder,AadhaarHolder,FathernameHolder,dobHolder,phnoHolder;
    Boolean EditTextEmptyHolder;
    SQLiteDatabase sqLiteDatabaseObj;
    String SQLiteDataBaseQueryHolder ;
    SQLiteHelper sqLiteHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form1);
        last = (Button)findViewById(R.id.nxt);
        Name1 = (EditText)findViewById(R.id.edittxt1);
        gender=(EditText)findViewById(R.id.gender);
        Marital_status = (EditText)findViewById(R.id.marri);
        Aadhaar = (EditText)findViewById(R.id.edittxt4);
        Fathername = (EditText)findViewById(R.id.edittxt5);
        dob = (EditText)findViewById(R.id.editTextDate);
        phno=(EditText)findViewById(R.id.editTextNumber);
        sqLiteHelper = new SQLiteHelper(this);
        // Adding click listener to register button.
        last.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SQLiteDataBaseBuild();
                // Creating SQLite table if dose n't exists.
                SQLiteTableBuild();
                // Checking EditText is empty or Not.
               if(CheckEditTextStatus())
               {
                   validation();
                   aadhar();
                   dob();
                // Empty EditText After done inserting process.
               }
                CheckEditTextStatus();
                InsertDataIntoSQLiteDatabase();
                EmptyEditTextAfterDataInsert();
            }
        } );
    }
    public void SQLiteDataBaseBuild()
    {
        sqLiteDatabaseObj = openOrCreateDatabase(SQLiteHelper.DATABASE_NAME, Context.MODE_PRIVATE, null);
    }
    // SQLite table build method.
    public void SQLiteTableBuild()
    {
        sqLiteDatabaseObj.execSQL("CREATE TABLE IF NOT EXISTS " + SQLiteHelper.TABLE_NAE1+ "(" + SQLiteHelper.Table_Column_ID1 + " PRIMARY KEY AUTOINCREMENT NOT NULL, " + SQLiteHelper.Table_Column_11_Name1 + " VARCHAR(60), "+ SQLiteHelper.Table_Column_12_GENDER +" VARCHAR, " + SQLiteHelper.Table_Column_13_Marital_status + " VARCHAR, " + SQLiteHelper.Table_Column_14_Aadhaar + " INTEGER,"+SQLiteHelper.Table_Column_15_Fathername + "VARCHAR,"+SQLiteHelper.Table_Column_16_dob + "INTEGER,"+SQLiteHelper.Table_Column_17_phno+" INTEGER)");
    }
    // Insert data into SQLite database method.
    public void InsertDataIntoSQLiteDatabase()
    {
        // If editText is not empty then this block will executed.
        if(EditTextEmptyHolder)
        {
            // SQLite query to insert data into table.
            SQLiteDataBaseQueryHolder = "INSERT INTO "+SQLiteHelper.TABLE_NAE1+" (name1,gender,msts,acard,fname,dob,phno) VALUES('"+NameHolder+"','"+genderHolder+"', '" +Marital_statusHolder+"','"+AadhaarHolder+"','"+FathernameHolder+"','"+dobHolder+"','"+phnoHolder+"');";
            // Executing query.
            sqLiteDatabaseObj.execSQL(SQLiteDataBaseQueryHolder);
            // Closing SQLite database object.
            sqLiteDatabaseObj.close();
            net();
        }
        else {
                Toast.makeText(Form.this, "Please Fill All The Required Fields.", Toast.LENGTH_LONG).show();
        }
    }
    public boolean CheckEditTextStatus()
    {
        // Getting value from All EditText and storing into String Variables.
        NameHolder = Name1.getText().toString() ;
        genderHolder=gender.getText().toString() ;
        Marital_statusHolder=Marital_status.getText().toString();
        AadhaarHolder=Aadhaar.getText().toString();
        FathernameHolder=Fathername.getText().toString();
        dobHolder=dob.getText().toString();
        phnoHolder=phno.getText().toString();
        if(TextUtils.isEmpty(NameHolder)|| TextUtils.isEmpty(Marital_statusHolder)|| TextUtils.isEmpty(AadhaarHolder)|| TextUtils.isEmpty(FathernameHolder)|| TextUtils.isEmpty(dobHolder)|| TextUtils.isEmpty(phnoHolder))
        {
            EditTextEmptyHolder = false ;
        }
        else {
            EditTextEmptyHolder = true ;
        }
        return EditTextEmptyHolder;
    }
    // Empty edittext after done inserting process method.
    public void EmptyEditTextAfterDataInsert()
    {
        Name1.getText().clear();
        gender.getText().clear();
        Marital_status.getText().clear();
        Aadhaar.getText().clear();
        Fathername.getText().clear();
        dob.getText().clear();
        phno.getText().clear();
    }
    public boolean validation() {
        String phnum= phno.getText().toString().trim();
        String phnopattern = "[0-9]+";
        if (phnum.matches(phnopattern)&& phno.length() == 10)
        {

        }
        else {
            Toast.makeText(getApplicationContext(), "Invalid Phone Number", Toast.LENGTH_SHORT).show();
        }
        return true;
    }
    public boolean aadhar() {
        String adhar=   Aadhaar .getText().toString().trim();
        String adharpattern = "[0-9]+";
        if (adhar.matches(adharpattern)&& Aadhaar.length() == 12)
        {

        }
        else {
            Toast.makeText(getApplicationContext(), "Invalid Aadhaar Number ", Toast.LENGTH_SHORT).show();
        }
        return true;
    }
    public boolean dob() {
        String date=   dob .getText().toString().trim();
        String dobpattern = "[0-9]+[0-9]+/[0-9]+[0-9]+/[0-9]+[0-9]+[0-9]+[0-9]";
        if (date.matches(dobpattern)&& dob.length() == 10)
        {

        }
        else {

        }
        return true;
    }
    public void net()
   {
       Intent intent=new Intent(Form.this,form2.class);
       startActivity(intent);
   }
}


