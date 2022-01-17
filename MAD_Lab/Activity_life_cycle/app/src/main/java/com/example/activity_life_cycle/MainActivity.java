package com.example.activity_life_cycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("Activity lifecycle","onStart is invoked");
        Toast.makeText(MainActivity.this,"onStart is invoked", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Activity lifecycle" + "","in method onCreate");
        Toast.makeText(MainActivity.this,"onCreate is invoked", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d("Activity lifecycle" + "","in method onStop");
        Toast.makeText(MainActivity.this,"onStop is invoked", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d("Activity lifecycle" + "","in method onResume");
        Toast.makeText(MainActivity.this,"onResume is invoked", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d("Activity lifecycle" + "","in method onPause");
        Toast.makeText(MainActivity.this,"onPause is invoked", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("Activity lifecycle" + "","in method onDestroy");
        Toast.makeText(MainActivity.this,"onDestroy is invoked", Toast.LENGTH_LONG).show();
    }
}
