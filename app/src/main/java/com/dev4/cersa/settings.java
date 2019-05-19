package com.dev4.cersa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class settings extends AppCompatActivity {
    Button profile;
    Button password;
    Button nickname;
    Button delete;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        profile =  (Button)findViewById(R.id.profbtn);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(settings.this, MainActivity.class);
                startActivity(intent);
            }
        });
        password = (Button)findViewById(R.id.codebtn);
        password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(settings.this, MainActivity.class);
                startActivity(intent);
            }
        });
        nickname =  (Button)findViewById(R.id.nickbtn);
        nickname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(settings.this, MainActivity.class);
                startActivity(intent);
            }
        });
        delete = (Button)findViewById(R.id.delbtn);
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(settings.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
