package com.training.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    //Code to take care of core business logic
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //sets activity view as following
        setContentView(R.layout.activity_main);

        Log.d("tag", "In onCreate");
    }
    //Log tracks what the activity is in
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("tag", "In onStop");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("tag", "In onStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("tag", "In onResume");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("tag", "In onDestroy");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("tag", "In onPause");
    }
}