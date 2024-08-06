package com.example.sixthsemester;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DBForm extends Activity {
    MyDBHelper helper = new MyDBHelper(this);
    public void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.dbform);
        EditText id = findViewById(R.id.sid);
        EditText name = findViewById(R.id.name);
        EditText address = findViewById(R.id.address);
        TextView txtres = findViewById(R.id.res);

        findViewById(R.id.insert).setOnClickListener(e->{
            String sid = id.getText().toString();
            String sname=name.getText().toString();
            String saddress = address.getText().toString();
            helper.Insert(sid,sname,saddress);
            Toast.makeText(this,"Data Inserted Successfully!",Toast.LENGTH_SHORT).show();

        });

        findViewById(R.id.update).setOnClickListener(e->{
            String sid =id.getText().toString();
            String sname=name.getText().toString();
            String saddress = address.getText().toString();
            helper.Update(sid,sname,saddress);
            Toast.makeText(this,"Data Updated Successfully!",Toast.LENGTH_SHORT).show();


        });


        findViewById(R.id.delete).setOnClickListener(e->{
            String sid = id.getText().toString();
            helper.Delete(sid);
            Toast.makeText(this,"Data Deleted Successfully!",Toast.LENGTH_SHORT).show();


        });


        findViewById(R.id.read).setOnClickListener(e->{
            Cursor cursor = helper.Select();
            String res = "Sid\tName\tAddress\n";
            while(cursor.moveToNext()){
                int sid = cursor.getInt(0);
                String sname = cursor.getString(1);
                String sadd = cursor.getString(2);
                res+=sid+"\t"+sname+"\t"+sadd+"\n";
            }
            txtres.setText(res);
        });

    }
}
