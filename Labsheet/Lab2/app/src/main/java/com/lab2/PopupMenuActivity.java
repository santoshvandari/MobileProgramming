package com.lab2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;

public class PopupMenuActivity extends Activity {
    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.popupmenuactivity);
        Button btn = findViewById(R.id.popupmenu);
        btn.setOnClickListener(e->{
            PopupMenu menu = new PopupMenu(this,btn);
            menu.inflate(R.menu.mainmenu);
            menu.show();
        });


    }
}
