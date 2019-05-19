package com.dev4.cersa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EndCompetitive extends AppCompatActivity {
    Button Replay;
    Button ExitMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_competitive);

        Replay =  (Button)findViewById(R.id.Replaybtn);
        Replay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EndCompetitive.this, Competitive.class);

                startActivity(intent);
            }
        });
        ExitMenu =  (Button)findViewById(R.id.Exitbtn);
        ExitMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EndCompetitive.this, MainActivity.class);

                startActivity(intent);
            }
        });
    }
}
