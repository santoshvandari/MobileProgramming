package com.example.sixthsemester;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class DBForm extends Activity {
    MyDBHelper helper = new MyDBHelper(this);
    public void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.dbform);
        EditText id = findViewById(R.id.sid);
        EditText name = findViewById(R.id.name);
        EditText address = findViewById(R.id.address);
        findViewById(R.id.submit).setOnClickListener(e->{
            int sid = Integer.parseInt(id.getText().toString());
            String sname=name.getText().toString();
            String saddress = name.getText().toString();
            helper.Insert(sid,sname,saddress);
            Toast.makeText(this,"Data Inserted Successfully!",Toast.LENGTH_SHORT).show();

        });

    }
}
