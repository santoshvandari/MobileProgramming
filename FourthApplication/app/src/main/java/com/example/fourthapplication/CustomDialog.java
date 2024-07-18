package com.example.fourthapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class CustomDialog extends Activity {
    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.customdialog);

        Button btn = findViewById(R.id.btn);

        btn.setOnClickListener(e->{

        });
    }
}
