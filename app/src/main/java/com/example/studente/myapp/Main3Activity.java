package com.example.studente.myapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.Calendar;

import static com.example.studente.myapp.R.id.imageView2;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ImageView im1 = (ImageView)  findViewById(R.id.imageView2);
        ImageView im2 = (ImageView)  findViewById(R.id.imageView3);
        ImageView im3 = (ImageView)  findViewById(R.id.imageView4);
        ImageView im4 = (ImageView)  findViewById(R.id.imageView5);
        ImageView im5 = (ImageView)  findViewById(R.id.imageView6);

        ScrollView scr = (ScrollView)findViewById(R.id.scroll);


    }

}
