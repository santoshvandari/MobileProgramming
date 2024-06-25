package com.example.thirdapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Dashboard extends Activity {
    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.dashboard);

        TextView txt = findViewById(R.id.data);




        Intent in = getIntent();
        String name = in.getStringExtra("name");
        String address = in.getStringExtra("address");

        String result = "Name : "+name+"\nAddress : "+address;
        Log.d("Result ",result);
        txt.setText(result);
    }

}
