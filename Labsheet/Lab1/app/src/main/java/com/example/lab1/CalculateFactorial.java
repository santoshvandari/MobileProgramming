package com.example.lab1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class CalculateFactorial extends Activity {
    protected void  onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.calculatefactorial);
        EditText num=findViewById(R.id.num);
        TextView res=findViewById(R.id.res);
        findViewById(R.id.calculate).setOnClickListener(e->{
            int n=Integer.parseInt(num.getText().toString());
            if(n%2==0){
                int fact=0;
                for(int i=1;i<=n;i++){
                    fact+=i;
                }
                res.setText("Factorial : "+fact);
            }else{
                boolean status=false;
                for(int i=2;i<=n/2;i++){
                    if (n % i == 0) {
                        status=true;
                        break;
                    }
                }
                if(status){
                    res.setText(n+" is not Prime Number.");
                }else{
                    res.setText(n+" is Prime Number.");
                }
            }
        });

    }
}
