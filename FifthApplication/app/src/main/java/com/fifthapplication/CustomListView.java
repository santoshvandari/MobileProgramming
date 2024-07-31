package com.fifthapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class CustomListView extends Activity {
    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.customlistview);

        ListView list = findViewById(R.id.listview);
        String[] name={"Ram","Hari","Adi","Shyam"};
        String[] details={"Details1","Details2","Details3","Details4"};
        int[] img ={R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher};

        MyAdapter adapter = new MyAdapter(this,img,name,details);
        list.setAdapter(adapter);
    }
}
