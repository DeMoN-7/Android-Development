package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
ListView listView;
String [] name={"Ayush","Aachaman","Rahul"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.lv1);
        ArrayAdapter<String>adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,name);
        listView.setAdapter(adapter);
    }
}