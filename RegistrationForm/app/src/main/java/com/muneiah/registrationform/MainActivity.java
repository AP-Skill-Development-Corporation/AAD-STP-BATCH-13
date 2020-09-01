package com.muneiah.registrationform;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.muneiah.registrationform.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
String gender;
String lang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this
                ,R.layout.activity_main);
        binding.submitBtnId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (binding.male.isChecked()){
                   gender="Male";
                }else {
                    gender="Female";
                }
                if (binding.java.isChecked()){
                    lang="Java";
                } if(binding.cLang.isChecked()){
                    lang=lang+"\nC-Lang";
                } if(binding.cLang.isChecked()){
                    lang=lang+"\npython";
                }

                binding.tv.setText("name :"+binding.etName.getText().toString()+"\n"+
                        "Number "+binding.etMobilenumber.getText().toString()+"\n"+
                        binding.email.getText().toString()+"\n"+
                        gender+"\n"+
                        binding.spinnerBranch.getSelectedItem().toString()+"\n"+lang);
            }
        });
    }
}
