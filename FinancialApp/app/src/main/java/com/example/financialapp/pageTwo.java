package com.example.financialapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class pageTwo extends AppCompatActivity implements View.OnClickListener{
    EditText e1,e2,e3;
    TextView t1;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        e3=findViewById(R.id.e3);
        t1=findViewById(R.id.t1);
        b1=findViewById(R.id.b1);
        b1.setOnClickListener(this);
    }
    public void onClick(View view){

        int bal=Integer.parseInt(e1.getText().toString());
        int minLimit=Integer.parseInt(e2.getText().toString());
        int price=Integer.parseInt(e3.getText().toString());

        if ((bal-price)>=minLimit){
            t1.setText("You can afford it");
            int remainder=bal-price;
            e1.setText(""+remainder);

        }
        else{
            t1.setText("You Cant Afford.");
        }
    }
}