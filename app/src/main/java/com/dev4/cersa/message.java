package com.dev4.cersa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class message extends AppCompatActivity {
    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);


        //delay for came to start


        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override             public void run() {


                Intent intent4 = new Intent(message.this, Competitive.class);
                startActivity(intent4);                 finish();             }
                },3000);


    }
}
