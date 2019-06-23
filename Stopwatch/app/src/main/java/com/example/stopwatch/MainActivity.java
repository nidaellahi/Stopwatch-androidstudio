package com.example.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button buttonStart;
    Button buttonEnd;
    Chronometer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timer = findViewById(R.id.timer);
        buttonStart = findViewById(R.id.buttonStart);
        buttonEnd = findViewById(R.id.buttonEnd);
        buttonEnd.setAlpha(0);

        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonStart.animate().alpha(0).setDuration(300).start();
                buttonEnd.animate().alpha(1).translationY(-80).setDuration(300).start();
                timer.setBase(SystemClock.elapsedRealtime());
                timer.start();
            }
        });

    }
}
