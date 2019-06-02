package com.dev4.cersa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.Timer;
import java.util.TimerTask;

public class message extends AppCompatActivity {
    Timer timer;
    String course_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("key");
            //The key argument here must match that used in the other activity
            course_title=value;
            Log.i("apostolis", value);
        }
        //delay for came to start


        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override             public void run() {


                Intent intent4 = new Intent(message.this, Competitive.class);
                intent4.putExtra("key",course_title);
                startActivity(intent4);
                finish();
            }
                },3000);


    }
}
