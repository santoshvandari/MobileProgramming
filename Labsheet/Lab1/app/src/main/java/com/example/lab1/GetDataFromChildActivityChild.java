package com.example.lab1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class GetDataFromChildActivityChild  extends Activity {
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.getdatafromchildactivitychild);

        EditText name = findViewById(R.id.name);
        EditText address = findViewById(R.id.address);
        EditText age = findViewById(R.id.age);


        findViewById(R.id.submitButton).setOnClickListener(e -> {
            String n = name.getText().toString();
            String add = address.getText().toString();
            String a = age.getText().toString();

            Intent in = new Intent();
            in.putExtra("name", n);
            in.putExtra("address", add);
            in.putExtra("age", a);

            setResult(1, in);
            finish();
        });
    }
}
