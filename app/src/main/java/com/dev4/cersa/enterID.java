package com.dev4.cersa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class enterID extends AppCompatActivity {
    Integer ID;
    EditText enterID;
    Button FindID;
    public int userID=12345;
    boolean ans = true;



    private boolean checkID(int ID) {


        if (ID == userID ){ // Check if ID matches

            return true;

        } else //ID does not match
            return false;

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_id);
        enterID = (EditText) findViewById(R.id.textID);
        enterID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enterID.setText("");
            }
        });
        FindID = (Button) findViewById(R.id.findID);
        FindID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ID = Integer.valueOf(enterID.getText().toString());
                Log.i("apostolos", String.valueOf(ID));
                if(checkID(ID) & ans == true){
                    //an isxuei o kwdikos tr prepei na kli9i to game (pros to paron to gurizw apla sto main)
                    Intent intent = new Intent(enterID.this, choose_course.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(),"το ID που δώσατε δεν βρέθηκε παρακαλώ προσπαθήστε ξανά!",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(enterID.this, enterID.class);
                    startActivity(intent);
                }
            }
        });
    }
}
