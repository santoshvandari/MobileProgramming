package com.example.fourthapplication;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CustomDialog extends Activity {
    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.customdialog);

        Button btn = findViewById(R.id.btn);

        btn.setOnClickListener(e->{
            AlertDialog.Builder builder = new AlertDialog.Builder(this);

            LayoutInflater inflater = getLayoutInflater();
            View view = inflater.inflate(R.layout.sumcustomdialog,null);
            builder.setView(view);

            EditText pri=view.findViewById(R.id.principal);
            EditText time=view.findViewById(R.id.time);
            EditText rate=view.findViewById(R.id.rate);
            Button calc = view.findViewById(R.id.calc);
            TextView res = view.findViewById(R.id.txt);
            calc.setOnClickListener(x->{
                int p = Integer.parseInt(pri.getText().toString());
                int t = Integer.parseInt(time.getText().toString());
                int r = Integer.parseInt(rate.getText().toString());
                res.setText("Interest : "+(p*t*r/100));
            });



            AlertDialog dialog=builder.create();
            dialog.show();

        });
    }
}
