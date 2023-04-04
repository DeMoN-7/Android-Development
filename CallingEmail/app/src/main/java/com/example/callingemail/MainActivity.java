package com.example.callingemail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
ImageButton ib1,ib2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_main);
        ib1=findViewById(R.id.ib1);
        ib2=findViewById(R.id.ib2);
        ib1.setOnClickListener(this);
        ib2.setOnClickListener(this);
    }
    public void onClick(View view){
        switch (view.getId()){
            case R.id.ib1:
                Intent i1=new Intent(getApplicationContext(),callingPage.class);
                startActivity(i1);
                break;
        }
    }
}