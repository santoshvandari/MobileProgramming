package com.lab2;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class SimpleInterestFragment extends Fragment {
    public View onCreateView(LayoutInflater li, ViewGroup vg, Bundle b){
        View view = li.inflate(R.layout.simpleinterestfragment,vg,false);
        EditText pri  = view.findViewById(R.id.principle);
        EditText rate = view.findViewById(R.id.rate);
        EditText time = view.findViewById(R.id.time);
        TextView res = view.findViewById(R.id.res);
        view.findViewById(R.id.calc).setOnClickListener(e->{
            int p = Integer.parseInt(pri.getText().toString());
            int t = Integer.parseInt(rate.getText().toString());
            int r = Integer.parseInt(time.getText().toString());
            res.setText("Interst : "+(p*t*r/100));
        });
        return view;
    }
}
