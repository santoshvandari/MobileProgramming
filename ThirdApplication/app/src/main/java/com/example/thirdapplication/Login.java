package com.example.thirdapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

public class Login extends Activity {
    protected  void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.login);

        EditText name = findViewById(R.id.name);
        EditText address = findViewById(R.id.address);
        Button btn = findViewById(R.id.submit);

        btn.setOnClickListener(e->{
            String nm =String.valueOf(name.getText());
            String addr = address.getText().toString();

            Log.d("debug",nm);
            Log.d("debug",addr);

            Intent in = new Intent(this,Dashboard.class);
            in.putExtra("name",""+nm);
            in.putExtra("address",""+addr);
            startActivity(in);
        });

    }
}

