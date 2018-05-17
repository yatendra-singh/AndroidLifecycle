package com.singhy.activitylifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        displayLog("onCreate");
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        displayLog("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        displayLog("onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        displayLog("onRestart");
    }

    @Override
    protected void onPause() {
        displayLog("onPause");
        super.onPause();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        displayLog("onSaveInstanceState");
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        displayLog("onRestoreInstanceState");
    }

    @Override
    protected void onStop() {
        displayLog("onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        displayLog("onDestroy");
        super.onDestroy();
    }


    private void displayLog(String logMessage){
        Log.i("ActivityLifecycle",logMessage);
    }

}
