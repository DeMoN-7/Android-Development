package com.example.basic_calc_with_buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
Button b1,b2,b3,b4;
EditText e1,e2;
TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        t1=findViewById(R.id.t1);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
    }
    static  boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        for(int i=2;i<=num/2;i++)
        {
            if((num%i)==0)
                return  false;
        }
        return true;
    }
    @Override
    public void onClick(View view) {


        switch (view.getId()) {
            case R.id.b1: {
                String n1 = e1.getText().toString();
                int num1 = Integer.parseInt(n1);
                String n2 = e2.getText().toString();
                int num2 = Integer.parseInt(n2);
                int total = num2 + num1;
                t1.setText(" " + total);
                if(isPrime(total)) {
                    t1.setText("Addition is  " + total+" and it is prime");
                }
                else{
                    t1.setText("Addition is  " + total+" and it is not prime");
                }
                break;
            }
            case R.id.b2: {
                String n1 = e1.getText().toString();
                int num1 = Integer.parseInt(n1);
                String n2 = e2.getText().toString();
                int num2 = Integer.parseInt(n2);
                int total = num1 - num2;
                if(isPrime(total)) {
                    t1.setText("Subtraction is  " + total+" and it is prime");
                }
                else{
                    t1.setText("Subtraction is  " + total+" and it is not prime");
                }
                break;
            }
            case R.id.b3:
            {
                String n1 = e1.getText().toString();
                int num1 = Integer.parseInt(n1);
                String n2 = e2.getText().toString();
                int num2 = Integer.parseInt(n2);
                int total = num2 * num1;
                t1.setText(" " + total);
                if(isPrime(total)) {
                    t1.setText("Multiplication is  " + total+" and it is prime");
                }
                else{
                    t1.setText("Multiplication is  " + total+" and it is not prime");
                }
                break;
        }
            case R.id.b4: {
                String n1 = e1.getText().toString();
                int num1 = Integer.parseInt(n1);
                String n2 = e2.getText().toString();
                int num2 = Integer.parseInt(n2);
                int total = num1 / num2;
                t1.setText(" " + total);
                if(isPrime(total)) {
                    t1.setText("Division is  " + total+" and it is prime");
                }
                else{
                    t1.setText("Division is  " + total+" and it is not prime");
                }
                break;
            }


        }

    }
}