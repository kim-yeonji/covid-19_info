package com.example.covid_info;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MessageActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);
        setContentView(R.layout.activity_main);
        setAlarm.setAlarm(this);
    }
}