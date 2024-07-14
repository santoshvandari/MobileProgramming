package com.example.fourthapplication;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class OptionMenu extends AppCompatActivity {
    protected  void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.optionmenu);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mainmenu,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        TextView clickevent = findViewById(R.id.clickevent);
        int id = item.getItemId();
        if(id==R.id.bca) {
            clickevent.setText("BCA Clicked");
        }else if (id==R.id.bba){
            clickevent.setText("BBA Clicked");
        }
        return true;
    }
}
