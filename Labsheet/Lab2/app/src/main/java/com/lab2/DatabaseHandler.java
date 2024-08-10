package com.lab2;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHandler extends SQLiteOpenHelper {
    SQLiteDatabase db = this.getWritableDatabase();
    SQLiteDatabase dbr = this.getReadableDatabase();
    public DatabaseHandler(Context context){
        super(context,"College",null,1);
    }
    public void onCreate(SQLiteDatabase db){
        db.execSQL("CREATE TABLE student(roll int, name varchar(50),address varchar(50));");
    }


    public void onUpgrade(SQLiteDatabase db, int oldv, int newv){

    }


    public void InsertData(String roll,String name, String address){
        db.execSQL("INSERT INTO student VALUES("+roll+",'"+name+"','"+address+"');");
    }


    public void DeleteData(String roll){
        db.execSQL("DELETE FROM student WHERE roll="+roll+";");
    }


    public void UpdateData(String roll,String name,String address){
        db.execSQL("UPDATE student SET name='"+name+"',address='"+address+"' WHERE roll="+roll+";");
    }


    public Cursor SelectData(){
       return (dbr.rawQuery("SELECT * FROM student;",null));
    }
}
