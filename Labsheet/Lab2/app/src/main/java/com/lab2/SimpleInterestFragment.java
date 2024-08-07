package com.lab2;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SimpleInterestFragment extends Fragment {
    public View onCreateView(LayoutInflater li, ViewGroup vg, Bundle b){
        View view = li.inflate(R.layout.simpleinterestfragment,vg,false);
        return view;
    }
}
