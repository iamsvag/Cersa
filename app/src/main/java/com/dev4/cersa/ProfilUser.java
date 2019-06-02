package com.dev4.cersa;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ProfilUser extends AppCompatActivity {
    TextView name;
    TextView year;
    TextView nickname;
    String changenname;
    TextView level;
    TextView about;
    TextView winstreak;
    TextView playerID;
    Button stats;
    Button settings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_user);
        name = (TextView) findViewById(R.id.name);
        name.setText("Apostolos");
        year = (TextView) findViewById(R.id.year);
        year.setText("2014");
        nickname = (TextView) findViewById(R.id.enternickname);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("key");
            //The key argument here must match that used in the other activity
            nickname=(TextView)findViewById(R.id.enternickname);
            nickname.setText(value);
            Log.i("apostolis", value);
        }
        else{
            nickname.setText("metafts1s");

        }
        changenname =nickname.getText().toString();
        level = (TextView) findViewById(R.id.enterlevel);
        level.setText("9");
        about = (TextView) findViewById(R.id.enterabout);
        about.setText("i dont know what to write");
        winstreak = (TextView) findViewById(R.id.enterwinstreak);
        winstreak.setText("6");
        playerID = (TextView) findViewById(R.id.enterplayerID);
        playerID.setText("12345");
        stats =  (Button)findViewById(R.id.statsbtn);
        stats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfilUser.this, stats.class);
                startActivity(intent);
            }
        });
        settings = (Button)findViewById(R.id.setbtn);
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfilUser.this, settings.class);
                intent.putExtra("key", changenname);
                Log.i("apostolis", changenname);
                startActivity(intent);
            }
        });
    }
}
