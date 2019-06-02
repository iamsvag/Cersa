package com.dev4.cersa;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class practice_course extends AppCompatActivity implements View.OnClickListener  {


    Button prcourse1;
    Button prcourse2;
    Button prcourse3;
    Button prcourse4;
    Button prcourse5;
    Button contin;

    Integer count_course = 0;
    String course_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_course);

        prcourse1 = (Button) findViewById(R.id.prcourse1btn);
        prcourse2 = (Button) findViewById(R.id.prcourse2btn);
        prcourse3 = (Button) findViewById(R.id.prcourse3btn);
        prcourse4 = (Button) findViewById(R.id.prcourse4btn);
        prcourse5 = (Button) findViewById(R.id.prcourse5btn);
        contin = (Button) findViewById(R.id.continuebtn);

        prcourse1.setOnClickListener(this);
        prcourse2.setOnClickListener(this);
        prcourse3.setOnClickListener(this);
        prcourse4.setOnClickListener(this);
        prcourse5.setOnClickListener(this);
        contin.setOnClickListener(this);

        contin.setOnClickListener(new View.OnClickListener() {
            //check if the user pick course
            @Override
            public void onClick(View v) {
                if(course_title != null && count_course == 1) {
                    Intent intent = new Intent(practice_course.this, message.class);
                    intent.putExtra("key",course_title);
                    startActivity(intent);
                }
                else if(course_title == null && count_course == 0) {
                    Toast.makeText(getApplicationContext(),"You have not choose course for practice!",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(practice_course.this, practice_course.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(),"You must choose only one course for practice!",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(practice_course.this, practice_course.class);
                    startActivity(intent);
                }
            }
        });
    }

    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.prcourse1btn:
                course_title = prcourse1.getText().toString();
                prcourse1.setBackgroundColor(Color.BLUE);
                count_course = 1 ;
                break;
            case R.id.prcourse2btn:
                course_title = prcourse2.getText().toString();
                prcourse2.setBackgroundColor(Color.BLUE);
                count_course = count_course+ 1 ;
                break;
            case R.id.prcourse3btn:
                course_title = prcourse3.getText().toString();
                prcourse3.setBackgroundColor(Color.BLUE);
                count_course += 1 ;
                break;
            case R.id.prcourse4btn:
                course_title = prcourse4.getText().toString();
                prcourse4.setBackgroundColor(Color.BLUE);
                count_course += 1 ;
                break;
            case R.id.prcourse5btn:
                course_title = prcourse5.getText().toString();
                prcourse5.setBackgroundColor(Color.BLUE);
                count_course += 1 ;
                break;
        }
    }
}