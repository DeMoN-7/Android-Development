package com.example.autocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
AutoCompleteTextView atv;
String [] course ={"BScIT","BCA","BTech","MCA"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        atv=findViewById(R.id.atv1);
        ArrayAdapter <String>adapter=new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line,course);
        atv.setAdapter(adapter);
    }
}