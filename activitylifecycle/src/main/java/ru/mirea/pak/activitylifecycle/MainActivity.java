package ru.mirea.pak.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG,"OnCreate()");
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"OnStart()");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG,"OnSaveInstanceState()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"OnPause()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"OnResume()");
    }


}