package com.example.lab1;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class AndroidActivityLifeCycle extends Activity {
    private static final String TAG = "LifecycleDemo";
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.androidactivitylifecycle);
        Log.d(TAG, "onCreate called");
    }
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart called");
    }
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume called");
    }
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause called");
    }
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop called");
    }
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart called");
    }
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy called");
    }
}
