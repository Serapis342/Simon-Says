package com.serapis.simonsays;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button green_btn;
    Button red_btn;
    Button yellow_btn;
    Button blue_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        green_btn = findViewById(R.id.green_btn);
        red_btn = findViewById(R.id.red_btn);
        yellow_btn = findViewById(R.id.yellow_btn);
        blue_btn = findViewById(R.id.blue_btn);
    }
}