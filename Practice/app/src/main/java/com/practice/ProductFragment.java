package com.practice;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class ProductFragment extends Fragment {
    public View onCreateView(LayoutInflater li, ViewGroup vg, Bundle b) {
        View view = li.inflate(R.layout.productfragment, vg, false);
        EditText num1 = view.findViewById(R.id.num1);
        EditText num2 = view.findViewById(R.id.num2);
        TextView res = view.findViewById(R.id.res);

        view.findViewById(R.id.productButton).setOnClickListener(e->{
            int number1 = Integer.parseInt(num1.getText().toString());
            int number2 = Integer.parseInt(num2.getText().toString());
            int sum = number1 * number2;
            res.setText("Sum: " + sum);
        });
        return view;
    }
}
