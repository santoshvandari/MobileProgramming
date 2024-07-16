package com.example.fourthapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.widget.PopupMenu;

import org.w3c.dom.Text;

public class PopUpMenu extends Activity {
    protected void  onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.popupmenu);
        Button btn = findViewById(R.id.btn);
        TextView txt = findViewById(R.id.txt);
        btn.setOnClickListener(e->{
            PopupMenu menu = new PopupMenu(this,btn);
            menu.inflate(R.menu.mainmenu);
            menu.show();

            menu.setOnMenuItemClickListener(item -> {
                int id = item.getItemId();
                if(id==R.id.bca){
                    txt.setText("BCA Clicked");
                }else if(id==R.id.bba){
                    txt.setText("BBA Clicked");
                }else if(id==R.id.csit){
                    txt.setText("CSIT Clicked");
                }else if(id==R.id.bim){
                    txt.setText("BIM Clicked");
                }
                return true;
            });


        });
    }
}
