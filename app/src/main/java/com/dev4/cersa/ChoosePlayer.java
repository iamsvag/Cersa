package com.dev4.cersa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChoosePlayer extends AppCompatActivity {
    Button SearchOpp;
    Button SearchID;
    Button SearchPreOpp;
    public int value;
    private int ChooseOpp(int nvalue) {


        if (nvalue==0) { // Check an epelexe euresi paixti



        } else if (nvalue==1) {  // Check an epelexe euresi mesw id
            Intent intent = new Intent(ChoosePlayer.this, enterID.class);
            startActivity(intent);



        }else if(nvalue==2){// check an epelexe emfanisi proigoumenwn antipalwn


        }

        return 0;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_player);
        SearchOpp =  (Button)findViewById(R.id.SearchOppbtn);
        SearchOpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = 0;
                ChooseOpp( value);
            }
        });
        SearchPreOpp =  (Button)findViewById(R.id.SearchPreOppbtn);
        SearchPreOpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = 2;
                ChooseOpp( value);

            }
        });
        SearchID =  (Button)findViewById(R.id.SearchIdbtn);
        SearchID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = 1;
                ChooseOpp( value);

            }
        });
    }
}
