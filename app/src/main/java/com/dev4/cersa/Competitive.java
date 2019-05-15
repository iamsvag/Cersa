package com.dev4.cersa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Competitive extends AppCompatActivity {
public int playerid;
String Lesson1;
String Lesson2;
 String question="Erwtisi mathimatos";
public String AnswerA = "Apantisi 1";
TextView tvQuestion;
    TextView tvReport;
Button startGame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_competitive);

        ///


        //Players Matchmaking
       // playerid = chooseplayer();

        //Choose mutual lesson
       // commonLessons(); //Lesson1,Lesson2



     //Game Mode
        tvQuestion =(TextView)findViewById(R.id.tvQuestion) ;
        tvQuestion.setText(question);
        tvReport =(TextView)findViewById(R.id.tvReport) ;
        tvReport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Competitive.this, MainActivity.class);
                startActivity(intent);
            }
        });






        // handling timer (progress bar)
        //question bringer
        questions();

    }





    private void questions() {
        //Bring question info

    }
}
