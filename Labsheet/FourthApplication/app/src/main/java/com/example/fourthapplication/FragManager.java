package com.example.fourthapplication;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class FragManager extends Activity {
    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.fragmentmanager);

        Button first = findViewById(R.id.first);
        Button second = findViewById(R.id.second);

        Fragment fragment1 = new Frag1();
        getFragmentManager().beginTransaction().add(R.id.frame,fragment1).commit();

        first.setOnClickListener(e->{

            /* Fragment fragment = new Frag1();
            FragmentManager manager = getFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.replace(R.id.frame,fragment);
            transaction.commit(); */

            Fragment fragment = new Frag1();
            getFragmentManager().beginTransaction().replace(R.id.frame,fragment).commit();
        });
        second.setOnClickListener(e->{

            Fragment fragment = new Frag2();
            getFragmentManager().beginTransaction().replace(R.id.frame,fragment).commit();
        });
    }
}
