package com.lab2;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;

public class AlertDialogActivity extends Activity{
    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.alertdialogactivity);
        findViewById(R.id.alertdialog).setOnClickListener(e->{
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("BCA Program");
            builder.setMessage("Developed by BCA Student");
            builder.setPositiveButton("Ok",null);
            builder.setNegativeButton("Cancel",null);
            AlertDialog dialog = builder.create();
            dialog.show();
        });
    }
}
