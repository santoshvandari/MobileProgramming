package com.example.secondapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SumOfNumbers extends Activity {
    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.sumofnumbers);

        Button btn = findViewById(R.id.sum);
        EditText n1= findViewById(R.id.num1);
        EditText n2 = findViewById(R.id.num2);
        TextView txt = findViewById(R.id.result);
        btn.setOnClickListener(e->{
            try{

            int num1=Integer.parseInt(n1.getText().toString());
            int num2=Integer.parseInt(n2.getText().toString());
            int sum = num1+num2;
            txt.setText(String.valueOf(sum));
            }catch(Exception ex){
                Toast.makeText(this, "Something Went Wrong", Toast.LENGTH_SHORT).show();
            }

        });
    }
}
