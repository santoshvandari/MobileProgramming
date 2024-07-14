package com.example.lab1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class GetDataFromChildActivityParent extends Activity {
    TextView result
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.getdatafromchildactivityparent);

        result = findViewById(R.id.result);

        findViewById(R.id.btn).setOnClickListener(e->{
            Intent intent = new Intent(this, GetDataFromChildActivityChild.class);
            startActivityForResult(intent, 1);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1 && resultCode == 1) {
            String name = data.getStringExtra("name");
            String address = data.getStringExtra("address");
            String age = data.getStringExtra("age");

            String resdata = "Name: " + name + "\nAddress: " + address + "\nAge: " + age;
            result.setText(resdata);
        }
    }
}
