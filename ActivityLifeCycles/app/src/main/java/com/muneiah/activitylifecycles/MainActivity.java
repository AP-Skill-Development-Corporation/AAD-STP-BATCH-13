package com.muneiah.activitylifecycles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView mtexView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mtexView=findViewById(R.id.tv);
        mtexView.append("onCreate()\n");
        Log.i("MainActivity","onCreate()");
        Toast.makeText(this, "App is Created", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        mtexView.append("onStart()\n");
        Log.i("MainActivity","onStart()");
        Toast.makeText(this, "App is Started", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onResume() {
        super.onResume();
        mtexView.append("onResume()\n");
        Log.i("MainActivity","onResume()");
        Toast.makeText(this, "App is Resumed", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mtexView.append("onPause()\n");
        Log.i("MainActivity","onPause()");
        Toast.makeText(this, "App is Paused", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mtexView.append("onStop()\n");
        Log.i("MainActivity","onStop()");
        Toast.makeText(this, "App is Stopped", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mtexView.append("onDestroy()\n");
        Log.i("MainActivity","onDestroy()");
        Toast.makeText(this, "App is Destroyed", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        mtexView.append("onReStrat()\n");
        Log.i("MainActivity","onReStart()");
        Toast.makeText(this, "App is ReStarted", Toast.LENGTH_SHORT).show();
    }
}
