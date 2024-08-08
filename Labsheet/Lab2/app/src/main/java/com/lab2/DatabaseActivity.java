package com.lab2;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class DatabaseActivity extends Activity {
    public void onCreate(Bundle b){
        DatabaseHandler db = new DatabaseHandler(this);
        super.onCreate(b);
        setContentView(R.layout.databaseactivity);
        EditText roll=findViewById(R.id.rollno);
        EditText name= findViewById(R.id.name);
        EditText address = findViewById(R.id.address);
        TextView res = findViewById(R.id.result);
        findViewById(R.id.insert).setOnClickListener(e->{
            String r=roll.getText().toString();
            String n=name.getText().toString();
            String a=address.getText().toString();
            db.InsertData(r,n,a);

        });
        findViewById(R.id.update).setOnClickListener(e->{
            String r=roll.getText().toString();
            String n=name.getText().toString();
            String a=address.getText().toString();
            db.UpdateData(r,n,a);

        });
        findViewById(R.id.delete).setOnClickListener(e->{
            String r=roll.getText().toString();
            db.DeleteData(r);

        });
        findViewById(R.id.read).setOnClickListener(e->{
            Cursor data= db.SelectData();
            String dsp="Roll\tName\tAddress\n";
            while(data.moveToNext()){
                dsp+=data.getInt(0)+"\t"+data.getString(1)+"\t"+data.getString(2)+"\n";
            }
            res.setText(dsp);
        });
    }
}
