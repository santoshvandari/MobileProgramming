package com.example.lab1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SimpleCalculator extends Activity {
    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.simplecalculator);
        EditText num1 = findViewById(R.id.num1);
        EditText num2 = findViewById(R.id.num2);
        Button add = findViewById(R.id.add);
        Button sub = findViewById(R.id.sub);
        Button mul = findViewById(R.id.mul);
        Button div = findViewById(R.id.div);
        TextView res=findViewById(R.id.res);
        add.setOnClickListener(e->{
            res.setText("Addition : "+((Integer.parseInt(num1.getText().toString()))+(Integer.parseInt(num2.getText().toString()))));
        });
        sub.setOnClickListener(e->{
            res.setText("Subtraction : "+((Integer.parseInt(num1.getText().toString()))-(Integer.parseInt(num2.getText().toString()))));
        });
        mul.setOnClickListener(e->{
            res.setText("Multiplication : "+((Integer.parseInt(num1.getText().toString()))*(Integer.parseInt(num2.getText().toString()))));
        });
        div.setOnClickListener(e->{
            res.setText("Division : "+((Integer.parseInt(num1.getText().toString()))/(Integer.parseInt(num2.getText().toString()))));
        });
    }
}
