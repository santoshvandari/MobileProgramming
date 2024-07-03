package com.example.thirdapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Parent extends Activity {
    TextView txt;
    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.parent);

        txt = findViewById(R.id.txt);

        Button btn = findViewById(R.id.pbtn);

        btn.setOnClickListener(e->{
            Intent in = new Intent(this, Child.class);
//            startActivity(in);
            startActivityForResult(in,2);
        });
    }
//    Receiving the Child Activity Result
    @Override
    protected void onActivityResult(int requestCode,int resultcode, Intent data){
        super.onActivityResult(requestCode,resultcode,data);
        if(resultcode==2){
            String str = data.getStringExtra("program");
            txt.setText(str);
        }

    }

}
