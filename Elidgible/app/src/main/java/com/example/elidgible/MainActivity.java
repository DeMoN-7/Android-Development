package com.example.elidgible;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
EditText e1,e2,e3;
TextView t1,t2,t3;
Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        e3=findViewById(R.id.e3);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);

    }
    public void onClick(View view){
        int phy=Integer.parseInt(e1.getText().toString());
        int chem=Integer.parseInt(e2.getText().toString());
        int math=Integer.parseInt(e3.getText().toString());
        int total=phy+chem+math;
        int average=total/3;
        switch (view.getId()){
            case R.id.b1:
                t1.setText(""+total);
                break;
            case R.id.b2:
                t2.setText(""+average);
                break;
            case R.id.b3:
                if(average>=80)
                {
                    t3.setText("You are eligible with scholarship 12000");
                }
                if(average>=60)
                {
                    t3.setText("You are eligible with scholarship 8000");
                }
                else
                {
                    t3.setText("Not eligible");
                }

        }
    }
}