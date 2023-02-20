package com.example.stopwatch;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private int seconds = 0;
    private boolean running = false;
    private boolean wasRunning = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState != null){
            seconds = savedInstanceState.getInt("seconds");
            running = savedInstanceState.getBoolean("running");
            wasRunning = savedInstanceState.getBoolean("wasRunning");
        }

        runTimer();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("seconds",seconds);
        outState.putBoolean("running",running);
        outState.putBoolean("wasRunning",wasRunning);
    }

    @Override
    protected void onStop() {
        super.onStop();
        wasRunning = running;
        running = false;
    }

    @Override
    protected void onStart() {
        super.onStart();
        if(wasRunning) {
            running = true;
        }
    }

    public void runTimer(){
        TextView textView = (TextView)findViewById(R.id.time_view);
        Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int secs = seconds%60;
                String time = String.format(Locale.getDefault(),"%d",secs);
                textView.setText(time);
                if(running) {
                    seconds++;
                }
                handler.postDelayed(this,1000);
            }
        };

        handler.post(runnable);

    }

    public void onClickStart(View view){

        running = true;
        Toast toast = Toast.makeText(this, "Кусь!",Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onClickStop(View view){

        running = false;
    }

    public void onClickReset(View view){
        running = false;
        seconds = 0;
    }


}