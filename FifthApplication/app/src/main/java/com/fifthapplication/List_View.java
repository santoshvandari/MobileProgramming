package com.fifthapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class List_View extends Activity {
    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.list_view);

        ListView list = findViewById(R.id.listview);

        String[] course ={"Mobile","Economics","Network","Distributed","Java"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.listitem,R.id.items,course);
        list.setAdapter(adapter);

        list.setOnItemClickListener((a,v,pos,l)->{
            if(pos==0){
                Toast.makeText(this,"Mobile Clicked",Toast.LENGTH_SHORT).show();
            }
            if(pos==3){
                Toast.makeText(this,"Distribute CLicked",Toast.LENGTH_SHORT).show();
            }
        });




    }

}
