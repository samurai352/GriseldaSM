package com.smarchini.griseldasm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GriseldaMember BennyTheButcher = new GriseldaMember();
        GriseldaMember ConwayTheMachine = new GriseldaMember();
        GriseldaMember WestSideGunn = new GriseldaMember();
    }
}
