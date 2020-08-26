package com.muneiah.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView mTextView;
Button t_button,c_button;
int c=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView=findViewById(R.id.tv);
        t_button=findViewById(R.id.toast_button);
        c_button=findViewById(R.id.count_button);
       t_button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(MainActivity.this,"Welcome to App developmemt",Toast.LENGTH_SHORT)
                       .show();
           }
       });
       c_button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               c++;
            mTextView.setText(String.valueOf(c));
           }
       });
    }
}
