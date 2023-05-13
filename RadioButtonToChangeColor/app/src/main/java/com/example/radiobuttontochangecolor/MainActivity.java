package com.example.radiobuttontochangecolor;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
LinearLayout l1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1=findViewById(R.id.l1);
    }

    public void onclickRed(View view) {
        Toast.makeText(this, "RED", Toast.LENGTH_SHORT).show();
        l1.setBackgroundColor(Color.RED);
    }

    public void onclickBlue(View view) {
        Toast.makeText(this, "Blue", Toast.LENGTH_SHORT).show();
        l1.setBackgroundColor(Color.BLUE);
    }

    public void onclickGreen(View view) {
        Toast.makeText(this, "Green", Toast.LENGTH_SHORT).show();
        l1.setBackgroundColor(Color.GREEN);
    }
}