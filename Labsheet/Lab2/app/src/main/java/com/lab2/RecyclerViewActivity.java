package com.lab2;

import android.app.Activity;
import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewActivity extends Activity{
    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.recyclerviewactivity);

        String[] id={"1","2","3","4","5"};
        String[] name={"Hari","Ram","Sita","Geeta","Adi"};
        String[] address={"BTM","KTM","BRT","BDP","BTM"};





        RecyclerView view= findViewById(R.id.recyclerview);
        view.setLayoutManager(new LinearLayoutManager(this));


        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this,id,name,address);
        view.setAdapter(adapter);



    }
}
