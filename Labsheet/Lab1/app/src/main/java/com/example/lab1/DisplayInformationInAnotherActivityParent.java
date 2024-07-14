package com.example.lab1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class DisplayInformationInAnotherActivityParent extends Activity {

    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.displayinformationinanotheractivityparent);
        EditText name=findViewById(R.id.name);
        EditText age = findViewById(R.id.age);
        EditText address = findViewById(R.id.address);
        RadioGroup genderradiogroup = findViewById(R.id.gender);
        findViewById(R.id.submit).setOnClickListener(e->{
            String n = name.getText().toString();
            String a = age.getText().toString();
            String add=address.getText().toString();
            RadioButton selectedGenderButton = findViewById(genderradiogroup.getCheckedRadioButtonId());
            String gender = selectedGenderButton.getText().toString();
            Intent in = new Intent(this,DisplayInformationInAnotherActivityChild.class);
            in.putExtra("name", n);
            in.putExtra("address", add);
            in.putExtra("age", a);
            in.putExtra("gender", gender);
            startActivity(in);
        });
    }
}
