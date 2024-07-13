package com.example.lab1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SimpleInterest extends Activity {
    protected void  onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.simpleinterest);
        EditText pri=findViewById(R.id.principal);
        EditText rate = findViewById(R.id.rate);
        EditText time = findViewById(R.id.time);
        TextView interest=findViewById(R.id.interst);
        findViewById(R.id.calc).setOnClickListener(e->{
            int p=Integer.parseInt(pri.getText().toString());
            int r=Integer.parseInt(rate.getText().toString());
            int t=Integer.parseInt(time.getText().toString());
            interest.setText("Interest : "+(p*t*r/100));
        });

    }
}
