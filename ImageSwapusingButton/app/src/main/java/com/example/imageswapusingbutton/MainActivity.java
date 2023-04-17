package com.example.imageswapusingbutton;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ImageView i1;
Button b1;
    int i=0;
    int[] image ={R.drawable.ghost1,R.drawable.ghost2,R.drawable.spider,R.drawable.panther};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Made By Demon", Toast.LENGTH_SHORT).show();

        b1=findViewById(R.id.b1);
        i1=findViewById(R.id.i1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i1.setImageResource(image[i]);
                i++;
                if (i==4)
                    i=0;

            }
        });
    }
}