package com.example.basiccalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;


public class MainActivity extends AppCompatActivity  implements View.OnClickListener{
Button b1;
TextView t1,t2,t3,t4,t5,t6;
EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        t4=findViewById(R.id.t4);
        t5=findViewById(R.id.t5);
        t6=findViewById(R.id.t6);
        b1=findViewById(R.id.b1);
        b1.setOnClickListener(this);
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);

    }
    @Override
    public void onClick(View view) {
        String n1=e1.getText().toString();
        int num1=Integer.parseInt(n1);
        String n2=e2.getText().toString();
        int num2=Integer.parseInt(n2);
        int total = num2+num1;
        t3.setText(" "+ total);
        total = num1 - num2;
        t4.setText(" "+ total);
        total = num1 * num2;
        t5.setText(" "+ num1*num2);
        float fl = num1/num2;
        t6.setText(" "+ fl);

    }
}