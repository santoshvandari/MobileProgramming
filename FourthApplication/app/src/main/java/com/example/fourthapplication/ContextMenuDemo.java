package com.example.fourthapplication;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ContextMenuDemo extends AppCompatActivity {
    Button btn;
    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.contextmenu);
        btn=findViewById(R.id.clickme);
        registerForContextMenu(btn);
    }
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo info){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mainmenu,menu);
    }

    public boolean onContextItemSelected(MenuItem item){
        int id=item.getItemId();
        TextView txt = findViewById(R.id.clickevent);
        if(id==R.id.bca){
            txt.setText("BCA Clicked");
        } else if(id==R.id.bba) {
            txt.setText("BBA Clicked");
        }
        return true;
    }

}
