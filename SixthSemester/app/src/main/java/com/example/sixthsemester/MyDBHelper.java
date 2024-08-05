package com.example.sixthsemester;

import android.app.Activity;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDBHelper extends SQLiteOpenHelper {
    public MyDBHelper(Activity context){
        super(context,"BCA",null,1);
    }
    public void onCreate(SQLiteDatabase db){
        String sql = "CREATE TABLE Student(sid int, name varchar(30), address varchar(30));";
        db.execSQL(sql);
    }
    public void onUpgrade(SQLiteDatabase db, int oldv, int newv){
//        Used to Upgrade Database;
    }

    public void Insert(int sid, String name, String address){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("sid",sid);
        values.put("name",name);
        values.put("address",address);
        db.insert("Student",null,values);
        db.close();
      /*  String sql = "INSERT INTO Student(sid,name,address) VALUES("+sid+",'"+name+"','"+address+"');";
        db.execSQL(sql);
        db.close();     */
    }


}
