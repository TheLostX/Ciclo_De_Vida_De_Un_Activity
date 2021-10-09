package com.lost.actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        guardarLog("onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        guardarLog("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        guardarLog("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        guardarLog("OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        guardarLog("OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        guardarLog("OnDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        guardarLog("onRestart");
    }

    private void guardarLog(String nombreFuncion){
        Log.d(TAG, "Estoy en la funcion " + nombreFuncion);
    }
}