package com.example.financialapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
Button log;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        log=findViewById(R.id.log);
        log.setOnClickListener(this);
    }
    public void onClick(View view){
        Intent i1=new Intent(getApplicationContext(),pageTwo.class);
        startActivity(i1);
    }

}