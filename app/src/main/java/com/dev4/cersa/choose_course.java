package com.dev4.cersa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import java.util.Timer;
import java.util.TimerTask;


public class choose_course extends AppCompatActivity implements View.OnClickListener {

    String course_title;
    Timer timer;
    Button course1;
    Button course2;
    Button course3;
    Button course4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_course);




        course1 = (Button) findViewById(R.id.course1btn);
        course2 = (Button) findViewById(R.id.course2btn);
        course3 = (Button) findViewById(R.id.course3btn);
        course4 = (Button) findViewById(R.id.course4btn);

        course1.setOnClickListener(this);
        course2.setOnClickListener(this);
        course3.setOnClickListener(this);
        course4.setOnClickListener(this);

        timer = new Timer();
        //10sec timer to choose course
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                //take a course "random"
               // Toast.makeText(getApplicationContext(),"you did not choose on time.Random choise made by the system!",Toast.LENGTH_LONG).show();
                course_title = course1.getText().toString();
                Log.i("apostolis", String.valueOf(0));
                Intent intent = new Intent(choose_course.this, message.class);
                intent.putExtra("key",course_title);
                startActivity(intent);
                timer.cancel();
                timer.purge();

            }

        },10000);

    }

    //Bring the course from button
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.course1btn:
                Log.i("apostolis", String.valueOf(1));
                course_title = course1.getText().toString();
                Intent intent1 = new Intent(choose_course.this, message.class);
                intent1.putExtra("key",course_title);
                startActivity(intent1);
                timer.cancel();
                timer.purge();
                break;


            case R.id.course2btn:
                course_title = course2.getText().toString();
                Log.i("apostolis", String.valueOf(2));
                Intent intent2 = new Intent(choose_course.this, message.class);
                intent2.putExtra("key",course_title);
                startActivity(intent2);
                timer.cancel();
                timer.purge();
                break;


            case R.id.course3btn:
                course_title = course3.getText().toString();
                Log.i("apostolis", String.valueOf(3));
                Intent intent3 = new Intent(choose_course.this, message.class);
                intent3.putExtra("key",course_title);
                startActivity(intent3);
                timer.cancel();
                timer.purge();
                break;

            case R.id.course4btn:
                course_title = course4.getText().toString();
                Log.i("apostolis", String.valueOf(4));
                Intent intent4 = new Intent(choose_course.this, message.class);
                intent4.putExtra("key",course_title);
                startActivity(intent4);
                timer.cancel();
                timer.purge();
                break;


        }

    }

    private void CommonCourses() {
        //Bring courses
        //return course_title;
    }

}
