package com.example.login;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
import android.widget.TextView;

public class SQLiteHelper extends SQLiteOpenHelper
{
    public static final String DATABASE_NAME="project";
    public static final String TABLE_NAME="UserTable";
    public static final String Table_Column_ID="id";
    public static final String Table_Column_1_Name="name";
    public static final String Table_Column_2_Email="email";
    public static final String Table_Column_3_Password="password";
    public static final String TABLE_NAE1="detail";
    public static final String Table_Column_ID1="id";
    public static final String Table_Column_11_Name1="name1";
    public static final String Table_Column_12_GENDER="gender";
    public static final String Table_Column_13_Marital_status="msts";
    public static final String Table_Column_14_Aadhaar="acard";
    public static final String Table_Column_15_Fathername="fname";
    public static final String Table_Column_16_dob="dob";
    public static final String Table_Column_17_phno="phno";
    public static final String TABLE_NAME2="qualification";
    public static final String Table_Column_ID2="id";
    public static final String Table_Column_18_name="name";
    public static final String Table_Column_19_course="course";
    public static final String Table_Column_20_deg="degree";
    public static final String Table_Column_21_clg="college";
    public static final String Table_Column_22_per="per";
    public static final String Table_Column_23_phone="phone";

    public SQLiteHelper(Context context)
    {
        super(context, DATABASE_NAME, null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase database)
    {
        String CREATE_TABLE="CREATE TABLE IF NOT EXISTS "+TABLE_NAME+" ("+Table_Column_ID+" INTEGER PRIMARY KEY, "+Table_Column_1_Name+" VARCHAR, "+Table_Column_2_Email+" VARCHAR, "+Table_Column_3_Password+" VARCHAR)";
        database.execSQL(CREATE_TABLE);
        String CREATE_TABLE1="CREATE TABLE IF NOT EXISTS "+TABLE_NAE1+" ("+Table_Column_ID1+" INTEGER PRIMARY KEY, "+Table_Column_11_Name1+" VARCHAR,"+Table_Column_12_GENDER+" VARCHAR,"+Table_Column_13_Marital_status+" VARCHAR,"+Table_Column_14_Aadhaar+" INTEGER,"+Table_Column_15_Fathername+" VARCHAR,"+Table_Column_16_dob+" INTEGER,"+Table_Column_17_phno+" INTEGER)";
        database.execSQL(CREATE_TABLE1);
        String CREATE_TABLE2="CREATE TABLE IF NOT EXISTS "+TABLE_NAME2+" ("+Table_Column_ID2+" INTEGER PRIMARY KEY, "+Table_Column_18_name+" VARCHAR,"+Table_Column_19_course+" VARCHAR,"+Table_Column_20_deg+" VARCHAR,"+Table_Column_21_clg+" VARCHAR,"+Table_Column_22_per+" INTEGER,"+Table_Column_23_phone +" INTEGER)";
        database.execSQL(CREATE_TABLE2);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAE1);
        onCreate(db);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME2);
        onCreate(db);
    }
    public Cursor getAllDetail()
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from qualification WHERE course = ?",new String[] {"sslc"});
        return res;
    }
    public Cursor AllDetail()
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from qualification WHERE course = ?",new String[] {"hss"});
        return res;
    }
    public Cursor ugDetail()
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from qualification WHERE course = ?",new String[] {"ug"});
        return res;
    }
    public Cursor pgDetail()
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from qualification WHERE course = ?",new String[] {"pg"});
        return res;
    }
}
