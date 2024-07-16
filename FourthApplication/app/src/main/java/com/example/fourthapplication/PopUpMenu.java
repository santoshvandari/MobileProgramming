package com.example.fourthapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.widget.PopupMenu;

public class PopUpMenu extends Activity {
    protected void  onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.popupmenu);
        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(e->{
            PopupMenu menu = new PopupMenu(this,btn);
            menu.inflate(R.menu.mainmenu);
            menu.show();

        });
    }
}
