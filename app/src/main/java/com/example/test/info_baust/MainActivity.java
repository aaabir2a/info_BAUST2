package com.example.test.info_baust;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onclick(View view){

        Intent A = new Intent(this,Gpa.class);
        startActivity(A);
    }

    public void onclick2(View view){

        Intent B = new Intent(this,Routine.class);
        startActivity(B);
    }

}
