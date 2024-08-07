package com.lab2;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ContextMenuActivity extends AppCompatActivity {
    protected void  onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.contextmenuactivity);

        registerForContextMenu(findViewById(R.id.cxtmenu));
    }
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuinfo){
        getMenuInflater().inflate(R.menu.mainmenu,menu);
    }

}
