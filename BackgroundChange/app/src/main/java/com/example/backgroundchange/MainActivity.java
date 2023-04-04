package com.example.backgroundchange;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button b1,b2,b3;
ConstraintLayout l1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        l1=findViewById(R.id.l1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
    }
    public void onClick(View view){

        switch (view.getId()){
            case R.id.b1:

                l1.setBackgroundColor(Color.GREEN);
                b1.setBackgroundColor(Color.RED);
                break;
            case R.id.b2:
                l1.setBackgroundColor(Color.RED);
                b3.setBackgroundColor(Color.BLUE);
                b1.setBackgroundColor(Color.GREEN);
                b3.setBackgroundColor(Color.BLUE);
                break;
            case R.id.b3:
                l1.setBackgroundColor(Color.BLUE);
                b3.setBackgroundColor(Color.RED);
                break;
        }
    }
}