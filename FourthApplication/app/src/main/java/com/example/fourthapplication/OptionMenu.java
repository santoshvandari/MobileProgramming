package com.example.fourthapplication;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

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
}
