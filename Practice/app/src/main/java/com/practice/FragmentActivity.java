package com.practice;

import android.app.Activity;
import android.os.Bundle;

public class FragmentActivity extends Activity {
    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.fragmentactivity);
        getFragmentManager().beginTransaction()
                .replace(R.id.sumfragment, new SumFragment())
                .replace(R.id.productfragment, new ProductFragment())
                .commit();
    }
}
