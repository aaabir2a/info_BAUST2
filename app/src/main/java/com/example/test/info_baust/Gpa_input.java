package com.example.test.info_baust;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

import Adapter.CustomListAdapter;
import Model.Course;

public class Gpa_input extends AppCompatActivity {

    private ListView listInput;
    private Button submitData;
    private int numberOfCourse;
    private CustomListAdapter dataAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpa_input);

        listInput = (ListView) findViewById(R.id.inputList);
        submitData = (Button) findViewById(R.id.submit_data);

        numberOfCourse = getIntent().getIntExtra("data", 1);

        ArrayList<Course> dataToSend = new ArrayList<>();
        for (int i = 0; i < numberOfCourse; i++){
            Course course = new Course();
            dataToSend.add(course);
        }

        dataAdapter = new CustomListAdapter(this, R.layout.input_row, dataToSend);

        listInput.setAdapter(dataAdapter);


        submitData.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                double totalGPA = 0;
                double totalCredit = 0;
                double CGPA = 0;

                for (int i = 0; i < numberOfCourse; i++){
                    EditText temp_credit = (EditText) listInput.getChildAt(i).findViewById(R.id.credit_input);
                    EditText temp_grade = (EditText) listInput.getChildAt(i).findViewById(R.id.grade_input);

                    System.out.println(i);
                    System.out.println(temp_credit.getText().toString() + " " + temp_grade.getText().toString());

                    totalCredit += Integer.parseInt(temp_credit.getText().toString());
                    totalGPA += Double.parseDouble(temp_grade.getText().toString()) * Integer.parseInt(temp_credit.getText().toString());

                    System.out.println (totalGPA);
                    System.out.println();
                }

                CGPA = totalGPA / totalCredit;

                Intent i = new Intent(Gpa_input.this, Result.class);

                i.putExtra("cgpa", CGPA);

                startActivity(i);
            }
        });

        dataAdapter.notifyDataSetChanged();
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(Gpa_input.this, MainActivity.class));
        Gpa_input.this.finish();
    }
}
