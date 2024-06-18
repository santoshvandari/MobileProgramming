package com.example.thirdapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class BCA extends Activity {
    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.bca);
        Log.d("BCA","Activity Created");
        Button btn = findViewById(R.id.btn1);
        btn.setOnClickListener(e->{
            Intent in = new Intent(this,Second.class);
            startActivity(in);
        });
    }
    protected  void onStart(){
        super.onStart();
        Log.d("BCA","Activity Started");
    }

    protected void onResume(){
        super.onResume();
        Log.d("BCA","Activity Resume");
    }
    protected void onStop(){
        super.onStop();
        Log.d("BCA","Activity Stopped");
    }
    protected void onDestroy(){
        super.onDestroy();
        Log.d("BCA","Activity Destroy");
    }
}
