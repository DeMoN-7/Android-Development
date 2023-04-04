package com.example.caniafford;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Emailpage extends AppCompatActivity {
Button send;
EditText body,subject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emailpage);
        send=findViewById(R.id.send);
        subject=findViewById(R.id.subject);
        body=findViewById(R.id.body);

        send.setOnClickListener(view -> {
                String s1=subject.getText().toString();
                String s2=body.getText().toString();
                String email="singhayush6264@gmail.com";
                Intent intent = new Intent(Intent.ACTION_SEND);
            intent.putExtra(Intent.EXTRA_EMAIL, new String[]{email});
            intent.putExtra(Intent.EXTRA_SUBJECT, s1);
            intent.putExtra(Intent.EXTRA_TEXT, s2);
            intent.setType("message/rfc822");
            startActivity(Intent.createChooser(intent, "Choose an Email client :"));

        });
    }
}