 package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

 public class MainActivity extends AppCompatActivity {
RadioGroup radioGroup;
LinearLayout l1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup=findViewById(R.id.rg11);
        l1=findViewById(R.id.l1);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.btn1:
                        l1.setBackgroundColor(Color.RED);
                        break;
                    case R.id.btn2:
                        l1.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.btn3:
                        l1.setBackgroundColor(Color.GREEN);
                        break;
                }
            }
        });
    }
}