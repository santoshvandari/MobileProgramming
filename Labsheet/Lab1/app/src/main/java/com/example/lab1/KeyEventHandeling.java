package com.example.lab1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class KeyEventHandeling extends Activity {
    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.keyeventhandeling);
        EditText txt = findViewById(R.id.text);
        TextView res = findViewById(R.id.result);
        txt.setOnKeyListener((view,keypressed,event)->{
            String text = txt.getText().toString();
            res.setText("Key Pressed : "+text);
            return true;
        });
    }

}
