package com.dev4.cersa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Competitive extends AppCompatActivity {
public int playerid;
String Lesson1;
String Lesson2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_competitive);


        //Players Matchmaking
        playerid = chooseplayer();

        //Choose mutual lesson
        commonLessons(); //Lesson1,Lesson2

     //Game Mode


        questions();

    }

    private int chooseplayer() {

       playerid=1545;
        return playerid;
    }

    private void commonLessons() {

    }

    private void questions() {
        //Bring question info

    }
}
