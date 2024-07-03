package com.example.thirdapplication;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Child extends Activity {
    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.child);

        Button btn = findViewById(R.id.cbtn);

        btn.setOnClickListener(e->{
            Intent in = new Intent(this,Parent.class);
            in.putExtra("program","BCA");
            setResult(2,in);
            finish();
        });
    }
}

