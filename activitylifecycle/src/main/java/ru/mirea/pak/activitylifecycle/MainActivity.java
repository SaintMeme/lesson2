package ru.mirea.pak.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String TAG = MainActivity.class.getSimpleName();
//    private String strText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG,"OnCreate()");
        setContentView(R.layout.activity_main);
//        final EditText editText = findViewById(R.id.editText);
//        String strText = editText.getText().toString(); // приводим к типу String

//        editText.setOnKeyListener(new View.OnKeyListener() {
//            @Override
//            public boolean onKey(View v, int keyCode, KeyEvent event) {
//                if(event.getAction() == KeyEvent.ACTION_DOWN &&
//                        (keyCode == KeyEvent.KEYCODE_ENTER))
//                {
//                    // сохраняем текст, введённый до нажатия Enter в переменную
//                    strText = editText.getText().toString();
//                    editText.setText(strText);
//                    return true;
//                }
//                return false;
//            }
//        });
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