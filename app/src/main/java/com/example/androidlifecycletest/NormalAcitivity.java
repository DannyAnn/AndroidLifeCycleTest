package com.example.androidlifecycletest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NormalAcitivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.normal_layout);
    }
}
