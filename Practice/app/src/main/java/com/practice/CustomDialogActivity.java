package com.practice;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CustomDialogActivity extends Activity {
    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.customdialogactivity);
        findViewById(R.id.calcsi).setOnClickListener(e->{
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            View view = getLayoutInflater().inflate(R.layout.customdialogsimpleinterest,null);
            builder.setView(view);
            EditText pri = view.findViewById(R.id.principal);
            EditText rate = view.findViewById(R.id.rate);
            EditText time = view.findViewById(R.id.time);
            TextView res = view.findViewById(R.id.res);
            view.findViewById(R.id.calc).setOnClickListener(z->{
                int p = Integer.parseInt(pri.getText().toString());
                int t = Integer.parseInt(rate.getText().toString());
                int r = Integer.parseInt(time.getText().toString());
                int si = p*t*r/100;
                res.setText("Interst : "+si);
            });
            builder.create().show();
        });
    }

}
