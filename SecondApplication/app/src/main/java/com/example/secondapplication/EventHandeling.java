package com.example.secondapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class EventHandeling extends Activity {
    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.eventhandeling);

        Button btn = findViewById(R.id.button1);
        TextView  txt1 = findViewById(R.id.txt1);

//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });

        btn.setOnClickListener(e->{
            txt1.setText("Developed By Santosh Bhandari");
        });




    }
}
