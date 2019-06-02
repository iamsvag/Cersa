package com.dev4.cersa;

import android.content.Intent;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Locale;
import java.util.Random;

public class Competitive extends AppCompatActivity {


    Button answer1,answer2,answer3,answer4;
    TextView tvQuestion;
    TextView tvReport;
    TextView questionCount;
    TextView coursename;

    //Timer Variables
   private TextView countDisplay;
   private CountDownTimer mCountDownTimer;
   private boolean mTimerRunning;
   private long mTimeLeftInMillis= START_TIME_IN_MILLIS;
    private static   final long  START_TIME_IN_MILLIS = 10000 ;



    private int count = 1;

    private Questions mQuestions = new Questions();
    private String mAnswer;
    private int mQusestinLength = mQuestions.mQuestions.length;


    Random r;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_competitive);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("key");
            //The key argument here must match that used in the other activity
            coursename=(TextView)findViewById(R.id.coursename);
            coursename.setText(value);
            Log.i("apostolis", value);
        }
        r=new Random();
//Button grab
        answer1 = (Button)findViewById(R.id.answerA);
        answer2 = (Button)findViewById(R.id.answerB);
        answer3 = (Button)findViewById(R.id.answerC);
        answer4 = (Button)findViewById(R.id.answerD);


//TExt view grab

        tvQuestion =(TextView)findViewById(R.id.tvQuestion);
        questionCount= (TextView)findViewById(R.id.questCount);
        countDisplay = (TextView)findViewById(R.id.CountDisplaybtn);
        // tvQuestion.setText(Questions);


        updateQuestion(r.nextInt(mQusestinLength));
//start button Handler

//Answer button handler

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (answer1.getText() == mAnswer){
                    Toast.makeText(Competitive.this, "Correct Answer", Toast.LENGTH_SHORT).show();
                    if (count <= 9) {

                        count++;
                        questionCount.setText("Question:" + count );
                        resetTimer();
                        updateQuestion(r.nextInt(mQusestinLength));
                        startTimer();
                    }else{
                            resetTimer();
                        Intent intent = new Intent(Competitive.this, MainActivity.class);
                        startActivity(intent);
                    }
                }else{
                    //   answer1.setBackgroundColor(Color.RED);
                    Toast.makeText(Competitive.this, "Wrong Answer", Toast.LENGTH_SHORT).show();

                    if (count <= 9) {
                        questionCount.setText("Question:" + count );
                        count++;
                        questionCount.setText("Question:" + count );
                        resetTimer();
                        updateQuestion(r.nextInt(mQusestinLength));
                        startTimer();
                    }else{
                            resetTimer();
                        Intent intent = new Intent(Competitive.this, EndCompetitive.class);
                        startActivity(intent);
                    }
                }

            }
        });
        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer2.getText() == mAnswer){
                    Toast.makeText(Competitive.this, "Correct Answer", Toast.LENGTH_SHORT).show();
                    if (count <= 9) {

                        count++;
                        questionCount.setText("Question:" + count );
                        updateQuestion(r.nextInt(mQusestinLength));
                    }else{

                        Intent intent = new Intent(Competitive.this, EndCompetitive.class);
                        startActivity(intent);
                    }
                }else{
                    //   answer1.setBackgroundColor(Color.RED);
                    Toast.makeText(Competitive.this, "Wrong Answer", Toast.LENGTH_SHORT).show();

                    if (count <= 9) {
                        questionCount.setText("Question:" + count );
                        count++;
                        questionCount.setText("Question:" + count );

                        updateQuestion(r.nextInt(mQusestinLength));
                    }else{

                        Intent intent = new Intent(Competitive.this, EndCompetitive.class);
                        startActivity(intent);
                    }
                }



            }
        });
        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer3.getText() == mAnswer){
                    Toast.makeText(Competitive.this, "Correct Answer", Toast.LENGTH_SHORT).show();
                    if (count <= 9) {

                        count++;
                        questionCount.setText("Question:" + count );
                        updateQuestion(r.nextInt(mQusestinLength));
                    }else{

                        Intent intent = new Intent(Competitive.this, EndCompetitive.class);
                        startActivity(intent);
                    }
                }else{
                    //   answer1.setBackgroundColor(Color.RED);
                    Toast.makeText(Competitive.this, "Wrong Answer", Toast.LENGTH_SHORT).show();

                    if (count <= 9) {
                        questionCount.setText("Question:" + count );
                        count++;
                        questionCount.setText("Question:" + count );

                        updateQuestion(r.nextInt(mQusestinLength));
                    }else{

                        Intent intent = new Intent(Competitive.this, EndCompetitive.class);
                        startActivity(intent);
                    }
                }

            }
        });
        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer4.getText() == mAnswer){
                    Toast.makeText(Competitive.this, "Correct Answer", Toast.LENGTH_SHORT).show();
                    if (count <= 9) {

                        count++;
                        questionCount.setText("Question:" + count );
                        updateQuestion(r.nextInt(mQusestinLength));
                    }else{

                        Intent intent = new Intent(Competitive.this, EndCompetitive.class);
                        startActivity(intent);
                    }
                }else{
                    //   answer1.setBackgroundColor(Color.RED);
                    Toast.makeText(Competitive.this, "Wrong Answer", Toast.LENGTH_SHORT).show();

                    if (count <= 9) {
                        questionCount.setText("Question:" + count );
                        count++;
                        questionCount.setText("Question:" + count );

                        updateQuestion(r.nextInt(mQusestinLength));
                    }else{

                        Intent intent = new Intent(Competitive.this, EndCompetitive.class);
                        startActivity(intent);
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


    }

    private void resetTimer() {
                mTimeLeftInMillis = START_TIME_IN_MILLIS;
        mTimerRunning= false;
          //      updateCountDownText();



    }

    private void updateQuestion(int num) {

        tvQuestion.setText(mQuestions.getQuestion(num));
        answer1.setText(mQuestions.getChoice1(num));
        answer2.setText(mQuestions.getChoice2(num));
        answer3.setText(mQuestions.getChoice3(num));
        answer4.setText(mQuestions.getChoice4(num));

        mAnswer = mQuestions.getCorrectAnswer(num);
        startTimer();

    }

    private void startTimer() {
        mCountDownTimer =new CountDownTimer(mTimeLeftInMillis,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                mTimeLeftInMillis=millisUntilFinished;
                updateCountDownText();


            }

            @Override
            public void onFinish() {
                mTimerRunning= false;
                Toast.makeText(Competitive.this, "Time is up!!", Toast.LENGTH_SHORT).show();




            }
        }.start();


        mTimerRunning =true;
        
    }

    private void updateCountDownText() {
        int minutes = (int) (mTimeLeftInMillis /1000) /60;
        int seconds = (int) ( mTimeLeftInMillis /1000)  % 60;

        String timeLeftFormatted=String.format(Locale.getDefault(),"%02d",seconds);

        countDisplay.setText(timeLeftFormatted);


    }



}
