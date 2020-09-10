package com.example.sharedpreferencesexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  EditText name,email,password;
  Button reg,log;
  SharedPreferences preferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        reg=findViewById(R.id.register);
        log=findViewById(R.id.login);
        preferences=getSharedPreferences("apssdc",MODE_PRIVATE);
    }

    public void register(View view) {
        String uname=name.getText().toString();
        String upassword=password.getText().toString();
        SharedPreferences.Editor editor=preferences.edit();
        if(uname.equals( "")){
            Toast.makeText(this, "Please enter the name", Toast.LENGTH_SHORT).show();
        }
        else if(upassword.equals("")){
            Toast.makeText(this, "Please enter the password", Toast.LENGTH_SHORT).show();
        }
        else{
            editor.putString("name",uname);
            editor.putString("password",upassword);
            editor.apply();
            Toast.makeText(this, "User Register Successfully", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(MainActivity.this,LoginActivity.class);
            startActivity(i);
        }

    }

    public void login(View view) {
        Intent i = new Intent(MainActivity.this,LoginActivity.class);
        startActivity(i);
    }
}