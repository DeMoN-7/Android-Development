package com.example.autocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
AutoCompleteTextView autoCompleteTextView;
    String[] language ={"C","C++","Java",".NET","iPhone","Android","ASP.NET","PHP"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this, android.R.layout.select_dialog_item,language);
        autoCompleteTextView=findViewById(R.id.ACT);
         autoCompleteTextView.setThreshold(1);
         autoCompleteTextView.setAdapter(adapter);
         autoCompleteTextView.setTextColor(Color.RED);
    }
}