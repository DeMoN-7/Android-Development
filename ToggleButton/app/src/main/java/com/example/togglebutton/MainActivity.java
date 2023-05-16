package com.example.togglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
ToggleButton tb1;
LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb1=findViewById(R.id.tb1);
        linearLayout=findViewById(R.id.l1);
        linearLayout.setBackgroundColor(Color.GREEN);

        tb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(MainActivity.this, "On", Toast.LENGTH_SHORT).show();
                    tb1.setX(0);
                    linearLayout.setBackgroundColor(Color.BLUE);
                }
                else {
                    Toast.makeText(MainActivity.this, "Off", Toast.LENGTH_SHORT).show();
                    tb1.setX(800);
                    linearLayout.setBackgroundColor(Color.GREEN);
                }
            }
        });
    }
}