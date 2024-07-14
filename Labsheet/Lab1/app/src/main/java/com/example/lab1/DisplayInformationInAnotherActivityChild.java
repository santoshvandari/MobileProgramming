package com.example.lab1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayInformationInAnotherActivityChild extends Activity {
    protected void onCreate(Bundle b){
        super.onCreate(b);

        setContentView(R.layout.displayinformationinanotheractivitychild);
        TextView n=findViewById(R.id.name);
        TextView a=findViewById(R.id.age);
        TextView add=findViewById(R.id.address);
        TextView ge=findViewById(R.id.gender);

        Intent in = getIntent();
        String name = in.getStringExtra("name");
        String address = in.getStringExtra("address");
        String age = in.getStringExtra("age");
        String gender = in.getStringExtra("gender");

        n.setText("Name: " + name);
        add.setText("Address: " + address);
        a.setText("Age: " + age);
        ge.setText("Gender: " + gender);

    }
}
