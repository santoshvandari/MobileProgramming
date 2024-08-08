package com.lab2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class GridViewActivity extends Activity{
    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.gridviewactivity);

        GridView grid = findViewById(R.id.gridlist);

        String courses[]={"BCA","BBA","BIM","CSIT","BIT"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.gridviewitem,R.id.txt,courses);
        grid.setAdapter(adapter);



    }
}
