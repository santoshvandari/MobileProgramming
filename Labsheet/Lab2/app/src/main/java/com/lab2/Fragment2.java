package com.lab2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.app.Fragment;


public class Fragment2 extends Fragment {
    public View onCreateView(LayoutInflater li, ViewGroup vg, Bundle b){
        return li.inflate(R.layout.fragment2,vg,false);
    }
}
