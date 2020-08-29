package com.muneiah.intentsinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText mEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditText=findViewById(R.id.et_url_input);
    }

//Explicit Intent
    public void showSecondScreen(View view) {
        Intent intentObj=new Intent(this,SecondActivity.class);
        startActivity(intentObj);
    }
//Implicit Intent
    public void showWebPage(View view) {
     String myUrl= mEditText.getText().toString();
        Uri uri=Uri.parse("https://www."+myUrl+".in");
        Intent i=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(i);

    }
}
