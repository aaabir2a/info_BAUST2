package com.example.test.info_baust;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import Fragments.Thursday;
import Model2.Class;


public class Routine_batch extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routine_batch);
    }

    public void onclick2(View view){

        Intent A = new Intent(this,Routine_main.class);
        startActivity(A);

    }









    }





