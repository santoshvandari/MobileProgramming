package com.example.secondapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;

public class StringArray extends Activity {
    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.stringarray);

        TextView txt = findViewById(R.id.course);
        ImageView img = findViewById(R.id.myimage);

//        String appname = getString(R.string.app_name);
//        txt.setText(appname);

        String[] arr = getResources().getStringArray(R.array.courses);

        txt.setText(Arrays.toString(arr));
        img.setImageResource(R.drawable.phone);



    }
}
