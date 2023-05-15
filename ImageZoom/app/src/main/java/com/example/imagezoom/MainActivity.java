package com.example.imagezoom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
Button b1,b2,b3;
ImageView iv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        iv1=findViewById(R.id.iv1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int he= iv1.getHeight();
                int wi=iv1.getWidth();
                iv1.getLayoutParams().height = he+50;
                iv1.getLayoutParams().width = wi+50;
                iv1.requestLayout();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int he= iv1.getHeight();
                int wi=iv1.getWidth();
                iv1.getLayoutParams().height = he-50;
                iv1.getLayoutParams().width = wi-50;
                iv1.requestLayout();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv1.getLayoutParams().height = ViewGroup.LayoutParams.WRAP_CONTENT;
                iv1.getLayoutParams().width = ViewGroup.LayoutParams.WRAP_CONTENT;
                iv1.requestLayout();
            }
        });

    }
}