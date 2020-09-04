package com.example.dateandtimepickers;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button datepicker,timepicker;
    int c_year,c_month,c_date;
    int mhours,mminutes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        datepicker=findViewById(R.id.date);
        datepicker.setOnClickListener(this);
        timepicker=findViewById(R.id.time);
        timepicker.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.date:
                openDatepicker();
                break;
            case R.id.time:
                openTimepicker();
                break;
        }


    }

    private void openTimepicker() {
        Calendar c= Calendar.getInstance();
        mhours=c.get(Calendar.HOUR_OF_DAY);
        mminutes=c.get(Calendar.MINUTE);
        //TimePickerDialog is a predefined class.
     TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
         @Override
         public void onTimeSet(TimePicker timePicker, int i, int i1) {
           String mytime=i+":"+i1;
             Toast.makeText(MainActivity.this, mytime, Toast.LENGTH_SHORT).show();
         }
     },mhours,mminutes,false);
     timePickerDialog.show();
    }

    private void openDatepicker() {
        Calendar c= Calendar.getInstance();
        c_year=c.get(Calendar.YEAR);
        c_month=c.get(Calendar.MONTH);
        c_date=c.get(Calendar.DAY_OF_MONTH);
        //DatePickerDialog is a class predefined
        DatePickerDialog datePickerDialog= new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener()
        {
            @Override
            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
            String mydate=i+"-"+(i1+1)+"-"+i2;
                Toast.makeText(MainActivity.this, mydate, Toast.LENGTH_SHORT).show();
            }
        },c_year,c_month,c_date);
   datePickerDialog.show();
    }
}