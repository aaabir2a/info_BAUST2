package com.example.test.info_baust;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Routine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routine);

    }

    public void onclick1(View view){

        Intent A = new Intent(this,Routine_batch.class);
        startActivity(A);

        Button b = (Button)view;
        String button1Text = b.getText().toString();
    }

}
