package com.dev4.cersa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class changeNickname extends AppCompatActivity {
String changename;
EditText newname;
TextView oldname;
Button Confirm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_nickname);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("key");
            //The key argument here must match that used in the other activity
            changename=value;

        }
        oldname=(TextView)findViewById(R.id.old);
        oldname.setText(changename);
        newname = (EditText) findViewById(R.id.old1);
        newname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                newname.setText("");

            }
        });
        Confirm = (Button) findViewById(R.id.btn);
        Confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changename =newname.getText().toString();
                Intent intent = new Intent(changeNickname.this, ProfilUser.class);
                intent.putExtra("key", changename);
                Log.i("apostolis", changename);
                startActivity(intent);
            }
        });
    }
}
