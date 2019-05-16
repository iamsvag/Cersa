package com.dev4.cersa;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Competitive extends AppCompatActivity {


    Button answer1,answer2,answer3,answer4;
    TextView tvQuestion;
    TextView tvReport;
    TextView questionCount;
    private int count = 1;

    private Questions mQuestions = new Questions();
    private String mAnswer;
    private int mQusestinLength = mQuestions.mQuestions.length;


    Random r;
public int playerid;
String Lesson1;
String Lesson2;
// String question="Erwtisi mathimatos";
//public String AnswerA = "Apantisi 1";

Button startGame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_competitive);


        r=new Random();

        answer1 = (Button)findViewById(R.id.answerA);
        answer2 = (Button)findViewById(R.id.answerB);
        answer3 = (Button)findViewById(R.id.answerC);
        answer4 = (Button)findViewById(R.id.answerD);




        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer1.getText() == mAnswer){
                    answer1.setBackgroundColor(Color.GREEN);

                    if (count <= 9) {
                        questionCount.setText("Question:" + count );
                        count++;
                        questionCount.setText("Question:" + count );

                        updateQuestion(r.nextInt(mQusestinLength));
                    }
                }
            }
        });
        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer2.getText() == mAnswer){
                    if (count <= 9) {

                        count++;
                        questionCount.setText("Question:" + count );
                        updateQuestion(r.nextInt(mQusestinLength));
                    }
                }

            }
        });
        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer3.getText() == mAnswer){
                    if (count <=9) {

                        count++;
                        questionCount.setText("Question:" + count );
                        updateQuestion(r.nextInt(mQusestinLength));
                    }
                }

            }
        });
        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer4.getText() == mAnswer){
                    if (count <=9) {

                        count++;
                        questionCount.setText("Question:" + count );
                        updateQuestion(r.nextInt(mQusestinLength));
                    }

                }

            }
        });

        ///


        //Players Matchmaking
       // playerid = chooseplayer();

        //Choose mutual lesson
       // commonLessons(); //Lesson1,Lesson2



     //Game Mode
        tvQuestion =(TextView)findViewById(R.id.tvQuestion);
        questionCount= (TextView)findViewById(R.id.questCount);

       // tvQuestion.setText(Questions);
        
        updateQuestion(r.nextInt(mQusestinLength));

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

    private void updateQuestion(int num) {

        tvQuestion.setText(mQuestions.getQuestion(num));
        answer1.setText(mQuestions.getChoice1(num));
        answer2.setText(mQuestions.getChoice2(num));
        answer3.setText(mQuestions.getChoice3(num));
        answer4.setText(mQuestions.getChoice4(num));

        mAnswer = mQuestions.getCorrectAnswer(num);
    }


    private void questions() {
        //Bring question info

    }
}
