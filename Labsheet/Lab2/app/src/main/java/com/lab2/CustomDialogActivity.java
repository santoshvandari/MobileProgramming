package com.lab2;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CustomDialogActivity extends Activity {
    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.customdialogactivity);

        findViewById(R.id.showdialog).setOnClickListener(e->{
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            View view = getLayoutInflater().inflate(R.layout.customdialog,null);
            builder.setView(view);
            EditText len = view.findViewById(R.id.len);
            EditText bre = view.findViewById(R.id.bre);
            TextView res = view.findViewById(R.id.res);
            view.findViewById(R.id.click).setOnClickListener(z->{
                int l = Integer.parseInt(len.getText().toString());
                int bd = Integer.parseInt(bre.getText().toString());
                res.setText("Area : "+(l*bd)+"\nPreimeter : "+(2*(l+bd)));
            });
            builder.create().show();
        });
    }
}
