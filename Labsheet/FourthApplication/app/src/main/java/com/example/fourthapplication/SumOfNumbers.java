package com.example.fourthapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SumOfNumbers extends Fragment {
    public View onCreateView(LayoutInflater li, ViewGroup vg, Bundle b){
        super.onCreateView(li,vg,b);
        View view = li.inflate(R.layout.sumofnumbers,vg,false);

        EditText nu1=view.findViewById(R.id.num1);
        EditText nu2=view.findViewById(R.id.num2);
        Button btn = view.findViewById(R.id.calc);
        TextView txt = view.findViewById(R.id.res);
        btn.setOnClickListener(e->{
            try {
                int n1 = Integer.parseInt(nu1.getText().toString());
                int n2 = Integer.parseInt(nu2.getText().toString());

                String res = String.valueOf(n1 + n2);
                txt.setText(res);
            }catch(Exception ex){
                txt.setText("Invalid Numbers");
            }
        });
        return view;
    }
}
