package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int curProgress;
    ProgressBar progressBar;
    int compCount = 0;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        curProgress = 0;
        progressBar = findViewById(R.id.progressBar2);
        textView = findViewById(R.id.textView);

    }

    public void buttonPress(View view){
        curProgress += (int)(Math.random() * 8) + 3;
        progressBar.setProgress(curProgress);
        if(progressBar.getProgress() >= 100){
            compCount++;
            progressBar.setProgress(0);
            curProgress = 0;
            textView.setText(Integer.toString(compCount));
        }
    }



}