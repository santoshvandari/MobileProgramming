package com.lab2;

import android.app.Activity;
import android.os.Bundle;

import android.app.Fragment;

public class FragmentActivity extends Activity {
    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.fragmentactivity);

        findViewById(R.id.frag1).setOnClickListener(e->{
            Fragment frag = new Fragment1();
            getFragmentManager().beginTransaction().replace(R.id.fragment,frag).commit();
        });

        findViewById(R.id.frag2).setOnClickListener(e->{
            Fragment frag = new Fragment2();
            getFragmentManager().beginTransaction().replace(R.id.fragment,frag).commit();
        });

    }
}
