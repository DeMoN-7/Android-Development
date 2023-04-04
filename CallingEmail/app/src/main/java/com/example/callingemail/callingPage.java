package com.example.callingemail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class callingPage extends AppCompatActivity implements View.OnClickListener{
EditText e1;
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calling_page);
        b1=findViewById(R.id.b1);
        e1=findViewById(R.id.e1);
        b1.setOnClickListener(this);
    }
    public void onClick(View view){
        String p1 = e1.getText().toString();
        Intent i11=new Intent(Intent.ACTION_CALL);
        i11.setData(Uri.parse("tel:" + p1));

        startActivity(i11);
    }
}