package com.example.test.info_baust;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Gpa extends AppCompatActivity {

    EditText courseNumber;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpa2);

        courseNumber = (EditText) findViewById(R.id.number_of_course);
        submit = (Button) findViewById(R.id.go_button);

        submit.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                int numberOfCourse = Integer.parseInt(courseNumber.getText().toString());

                Intent i = new Intent(Gpa.this, Gpa_input.class);
                i.putExtra("data", numberOfCourse);

                startActivity(i);

                Gpa.this.finish();
            }
        });
    }
    }




