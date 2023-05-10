package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView t1;
    Button b1, b2, b3;
    int count = 0;
    int x=11000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        t1 = findViewById(R.id.t1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new CountDownTimer(x, 1000) {

                    @Override
                    public void onTick(long l) {
                        t1.setText(String.valueOf(count));
                        count++;
                        b2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                cancel();
                            }
                        });
                        b3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                cancel();
                                count=0;
                                t1.setText(String.valueOf(count));
                            }
                        });
                    }

                    @Override
                    public void onFinish() {


                    }
                }.start();

            }
        });

    }
}