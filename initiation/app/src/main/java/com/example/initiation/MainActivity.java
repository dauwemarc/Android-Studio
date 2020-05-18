package com.example.initiation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public class public_void initiation(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.google.com.kh"));
        startActivity(browserIntent);
}
