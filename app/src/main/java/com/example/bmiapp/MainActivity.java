package com.example.bmiapp;

import android.content.Intent;
import  android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void firstbuttonclicked(View view){
        Intent intent = new Intent(this,activitytwo.class);
        startActivity(intent);
    }
}