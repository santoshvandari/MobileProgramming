package com.example.fourthapplication;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.widget.TextView;

public class AlertDialogDemo1 extends Activity {
    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.alertdialogdemo1);
        TextView txt = findViewById(R.id.txt);
        findViewById(R.id.btn).setOnClickListener(e->{
            //alert Dialog Box
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("BCA Program");
            builder.setMessage("Developed by BCA Student");
            builder.setIcon(R.drawable.ic_launcher_foreground);
            builder.setPositiveButton("Ok",(x,y)->{
                txt.setText("OK Option Clicked");
            });
            builder.setNegativeButton("Cancel",(x,y)->{
                txt.setText("Cancel Button Clicked");
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        });
    }
}
