package com.lab2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewActivity extends Activity {
    public void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.listviewactivity);

        ListView list = findViewById(R.id.listview);
        String lang[]={"C","C++","JAVA","Python","C#","JS","PHP","Swift","Rust","R"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.listviewitem,R.id.txt,lang);
        list.setAdapter(adapter);
    }
}
