package com.fifthapplication;

import android.app.Activity;
import android.os.Bundle;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Recycler_View extends Activity {
    protected  void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.recycler_view);

        String[] courses = {"BCA","BBA","CSIT","BIM"};
        String[] desc={"Description1","Description2","Description3","Description4"};

        RecyclerView recyclerview = findViewById(R.id.recycler);

//        For List
//        recyclerview.setLayoutManager(new LinearLayoutManager(this));




//        For Grid
        recyclerview.setLayoutManager(new GridLayoutManager(this,3));


        RecyclerAdapter adapter = new RecyclerAdapter(this,courses,desc);
        recyclerview.setAdapter(adapter);
    }
}
