package com.fifthapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class Grid_View extends Activity {
    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.grid_view);

        GridView grid = findViewById(R.id.gridview);
        String[] course = {"Mobile","Economics","Distributed","Java","Network"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.griditem,R.id.txt,course);
        grid.setAdapter(adapter);

        grid.setOnItemClickListener((adapterview,view,position,l)->{
            if(position==0){
                Toast.makeText(this,"Mobile Clicked",Toast.LENGTH_SHORT).show();
            }
            if(position==3){
                Toast.makeText(this,"Distribute CLicked",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
