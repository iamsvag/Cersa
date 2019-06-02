package com.dev4.cersa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class changePassword extends AppCompatActivity {
EditText oldpass;
EditText newpass1;
EditText newpass2;
Button confirm;
public int password=12345678;
   Long  old1;
    long  new1;
    long  new2;
    boolean a=false;
    boolean b=false;

    private void  message(boolean a, boolean b) {


        if (a==true && b==false){ // only the old pass is wrong

            Toast.makeText(getApplicationContext(),"you entered wrong old password!",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(changePassword.this, changePassword.class);
            startActivity(intent);
        } else if(a==false && b==true) {//the new pass do not match each other
            Toast.makeText(getApplicationContext(),"the new passwords do not much",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(changePassword.this, changePassword.class);
            startActivity(intent);
        }
        else if(a==true && b==true) {// both old pass and new pass do not match
            Toast.makeText(getApplicationContext(),"you entered wrong old password & newpasswords",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(changePassword.this, changePassword.class);
            startActivity(intent);
        }
        else  {//everything is under control
            Toast.makeText(getApplicationContext(),"password has changed",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(changePassword.this, ProfilUser.class);
            startActivity(intent);
        }
        return;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);

        oldpass = (EditText) findViewById(R.id.old1);
        oldpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                oldpass.setText("");

            }
        });

        newpass1 = (EditText) findViewById(R.id.new1);
        newpass1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                newpass1.setText("");

            }
        });

        newpass2 = (EditText) findViewById(R.id.new2);
        newpass2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                newpass2.setText("");

            }
        });
        confirm = (Button) findViewById(R.id.btn);
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                old1 = Long.valueOf(oldpass.getText().toString());
                Log.i("apostolis", String.valueOf(old1));
                if(old1!=password){
                    a=true;
                    Toast.makeText(getApplicationContext(),"you entered wrong old password!",Toast.LENGTH_LONG).show();

                }
                new1 = Integer.valueOf(newpass1.getText().toString());
                new2 = Integer.valueOf(newpass2.getText().toString());
                Log.i("apostolis", String.valueOf(new1));
                Log.i("apostolis", String.valueOf(new2));
                if(new1!=new2){
                    b=true;

                }
                message(a,b);
            }
        });

    }
}
