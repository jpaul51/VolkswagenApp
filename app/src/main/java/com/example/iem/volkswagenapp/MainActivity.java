package com.example.iem.volkswagenapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.iem.volkswagenapp.Model.Groupe;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Groupe volksWagen = new Groupe();


    }
}
