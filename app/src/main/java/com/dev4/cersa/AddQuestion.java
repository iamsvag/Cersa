package com.dev4.cersa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;



public class AddQuestion extends AppCompatActivity implements AdapterView.OnItemSelectedListener  {

    //Buttons
    Button apply;

    // User variables
    private String course;
    private String questiontype;
    private String answer;
    private String question;

    //RadioGroup

    RadioGroup radioGroup;
    RadioButton radioButton;
    private Button btnDisplay;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_question);

        //RadioGroup
        radioGroup = findViewById(R.id.radiogroup1);
        btnDisplay = (Button) findViewById(R.id.btnDisplay);


        //Spinner
        Spinner spinner = findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.courses, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        //Edit Text
        final EditText et1 = findViewById(R.id.editText2); // Question Form
        final EditText et2 = findViewById(R.id.editText3); // Answer Form
        final TextView et3 = findViewById(R.id.textView4);

        //Question Type

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioId = radioGroup.getCheckedRadioButtonId();

                radioButton = findViewById(radioId);

                if (radioGroup.getCheckedRadioButtonId() == -1) { // Check if question type selected

                    Toast.makeText(AddQuestion.this, "Please choose a question type", Toast.LENGTH_SHORT).show();

                    return;
                }
                
                questiontype   = radioButton.getText().toString();
                Toast.makeText(AddQuestion.this,
                        radioButton.getText(), Toast.LENGTH_SHORT).show();
                // Form Visibility according to question type
                if(questiontype.equals("Πολλαπλής Επιλογής")){
                    et1.setVisibility(View.VISIBLE);
                    et2.setVisibility(View.VISIBLE);
                    et3.setVisibility(View.VISIBLE);
                }else{
                    et1.setVisibility(View.VISIBLE);
                    et2.setVisibility(View.INVISIBLE);
                    et3.setVisibility(View.INVISIBLE);
                }
            }
        });


        //Button
        apply =  findViewById(R.id.button);

        apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddQuestion.this, MainActivity.class);
                question = et1.getText().toString();
                answer   = et2.getText().toString();

                boolean allclear =  ValidateQuestion(answer,question,questiontype,course);

            if(allclear){
             startActivity(intent);}


           }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        course = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), course , Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    //ValidateQuestion
    private boolean ValidateQuestion(String answer,String question,String tipos,String mathima) {


        if (mathima.equals("Choose Course")) { // Check if course selected

            Toast.makeText(this, "Please choose a course", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (radioGroup.getCheckedRadioButtonId() == -1){ // Check if question type selected

            Toast.makeText(this, "Please choose a question type", Toast.LENGTH_SHORT).show();


        return false;
    }



        if (question.equals("")) {
            Toast.makeText(this, "You did not enter a question", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (answer.equals("") && tipos.equals("Πολλαπλής Επιλογής")) {
            Toast.makeText(this, "You did not enter an answer ", Toast.LENGTH_SHORT).show();
            return false;
        }



        return true; // All clear
    }



}
