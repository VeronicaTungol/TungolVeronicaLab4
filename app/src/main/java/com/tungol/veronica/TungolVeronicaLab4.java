package com.tungol.veronica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class TungolVeronicaLab4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tungol_veronica_lab4);
        Log.d("4ITB", "onCreate: Successful");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4ITB", "onStart: Successful ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4ITB", "onResume: Successful ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4ITB", "onPause: Successful ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4ITB", "onStop: Successful");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4ITB", "onRestart: Successful ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4ITB", "onDestroy: Successful");
    }
    public void showMessage1(View view){
        Toast.makeText(this, "Go to the previous page.", Toast.LENGTH_LONG).show();
    }
    public void showMessage2(View view){
        Snackbar.make(view, "Go to the next page.", Snackbar.LENGTH_LONG).show();
    }
}
