package com.example.thirdapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Second extends Activity {
    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.secondpage);

        Button btn = findViewById(R.id.btn2);
        btn.setOnClickListener(e->{
            Intent in = new Intent(this,BCA.class);
            startActivity(in);
        });

    }

}
