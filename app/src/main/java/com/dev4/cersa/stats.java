package com.dev4.cersa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class stats extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private String period;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);

        //Spinner
        Spinner spinner = findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.period, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);












    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        period = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), period , Toast.LENGTH_SHORT).show();

        // Textviews
        final TextView et1 = findViewById(R.id.textView10); // Win
        final TextView et2 = findViewById(R.id.textView13); // Win num
        final TextView et3 = findViewById(R.id.textView8);  // Loses
        final TextView et4 = findViewById(R.id.textView12); // Loses num
        final TextView et5 = findViewById(R.id.textView11); // Time played
        final TextView et6 = findViewById(R.id.textView15); // Time played num

        if (period.equals("Επιλογή Περιόδου")){
            et1.setVisibility(View.VISIBLE);
            et2.setVisibility(View.INVISIBLE);
            et3.setVisibility(View.VISIBLE);
            et4.setVisibility(View.INVISIBLE);
            et5.setVisibility(View.VISIBLE);
            et6.setVisibility(View.INVISIBLE);
        }else if(period.equals("Τελευταία 10 παιχνίδια"))
        {
            et1.setVisibility(View.VISIBLE);
            et2.setVisibility(View.VISIBLE);
            et2.setText("6");
            et3.setVisibility(View.VISIBLE);
            et4.setVisibility(View.VISIBLE);
            et4.setText("4");
            et5.setVisibility(View.VISIBLE);
            et6.setVisibility(View.VISIBLE);
            et6.setText("30 minutes");
        }else if(period.equals("Τελευταίος Μήνας"))
        {
            et1.setVisibility(View.VISIBLE);
            et2.setVisibility(View.VISIBLE);
            et2.setText("32");
            et3.setVisibility(View.VISIBLE);
            et4.setVisibility(View.VISIBLE);
            et4.setText("17");
            et5.setVisibility(View.VISIBLE);
            et6.setVisibility(View.VISIBLE);
            et6.setText("130 minutes");
        }else if(period.equals("Τελευταίο Εξάμηνο"))
        {
            et1.setVisibility(View.VISIBLE);
            et2.setVisibility(View.VISIBLE);
            et2.setText("40");
            et3.setVisibility(View.VISIBLE);
            et4.setVisibility(View.VISIBLE);
            et4.setText("60");
            et5.setVisibility(View.VISIBLE);
            et6.setVisibility(View.VISIBLE);
            et6.setText("250 minutes");
        }



    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {


    }








}
