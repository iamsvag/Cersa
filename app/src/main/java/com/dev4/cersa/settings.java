package com.dev4.cersa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class settings extends AppCompatActivity {
    Button profile;
    Button password;
    Button nickname;
    Button delete;
    String changename;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        //trabaei apo to prohgoumeno acitivity to nickname
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("key");
            //The key argument here must match that used in the other activity
            changename=value;

        }
        //to button pou se odigei sto activity profil photo change alla den egine opote apla se girnaei sto main menu

        profile =  (Button)findViewById(R.id.profbtn);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(settings.this, MainActivity.class);
                startActivity(intent);
            }
        });
        //to button pou se odigei sto activity allagis kwdikou
        password = (Button)findViewById(R.id.codebtn);
        password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(settings.this, changePassword.class);
                startActivity(intent);
            }
        });
        //to button pou se odigei sto activity allagis nickname
        nickname =  (Button)findViewById(R.id.nickbtn);
        nickname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(settings.this, changeNickname.class);
                intent.putExtra("key", changename);
                Log.i("apostolis", changename);
                startActivity(intent);
            }
        });
        //to button pou se odigei sto activity diagrafis logariasmou
        //den egine opote apla se petaei sto main menu
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
