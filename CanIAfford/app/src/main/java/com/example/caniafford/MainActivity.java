package com.example.caniafford;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
ImageButton b1;
EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        b1.setOnClickListener(this);
    }
    public void onClick(View view){
        String S1=e1.getText().toString();
        String z="demon";
        String z1="demon123";
        String S2=e2.getText().toString();
        if(S1.equals(z) && S2.equals(z1)){
            Intent i1=new Intent(getApplicationContext(),pageTwo.class);
            startActivity(i1);
        }
        else if (S1.equals(z) && !(S2.equals(z1))){
            e2.setError("Incorrect");
        }
        else if (!(S1.equals(z)) && !(S2.equals(z1))){
            e2.setError("Incorrect");
            e1.setError("Incorrect");
        }
        else if (!(S1.equals(z)) && S2.equals(z1)){
            e1.setError("Incorrect");
        }
    }
}