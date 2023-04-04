package com.example.showerror;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class MainActivity extends AppCompatActivity {
    EditText name,mail,age;
    Button btn;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        age=findViewById(R.id.age);
        mail=findViewById(R.id.mail);
        btn=findViewById(R.id.btn);
        result=findViewById(R.id.result);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Name=name.getText().toString();
                String Mail=mail.getText().toString();
                String Age=age.getText().toString();
                if(check_name(Name).equals("plz fill name"))
                    name.setError("plz fill name");
                if(check_name(Name).equals("NAME MUST NOT CONTAINS INT OR SPECIAL CHAR"))
                    name.setError("NAME MUST NOT CONTAINS INT OR SPECIAL CHAR");
                if(check_age(Age).equals("plz fill the age"))
                    age.setError("plz fill the age");
                if(check_age(Age).equals("plz enter valid age"))
                    age.setError("plz enter valid age");
                if(check_age(Age).equals("there must be no ALP in age"))
                    age.setError("there must be no ALP in age");
                if(check_mail(Mail).equals("PLZ FILL THE EMAIL"))
                    mail.setError("PLZ FILL THE EMAIL");
                if(check_mail(Mail).equals("invalid"))
                    mail.setError("NOT A VALID EMAIL");
                String check="";
                check = check_mail(Mail) + check_age(Age) + check_name(Name);
                if(check.equals("111"))
                    result.setText("VALIDATION COMPLETE");
                else
                    result.setText("VALIDATION INCOMPLETE");
            }
        });
    }
    //----------------------------------------------------------------------------------------------
    public static String check_name(String name)
    {
        if(name.isEmpty()|| name==null|| name==" ")
            return "plz fill name";
        for(int i=0;i<name.length();i++)
        {
            if(Character.isAlphabetic(name.charAt(i))||Character.isWhitespace(name.charAt(i)))
                continue;
            else
                return"NAME MUST NOT CONTAINS INT OR SPECIAL CHAR";
        }
        return "1";
    }
    //----------------------------------------------------------------------------------------------
    public static String check_age(String age)
    {
        if (age==" "|| age==null||age.isEmpty())
            return "plz fill the age";

        if(age.length()>3||age.charAt(0)=='-')
            return "plz enter valid age";
        else
            for(int i=0;i<age.length();i++)
                if(Character.isAlphabetic(age.charAt(i)))
                    return "there must be no ALP in age";
        return "1";
    }
    //----------------------------------------------------------------------------------------------
    public static String check_mail(String email)
    {
        if(email==null || email.isEmpty())
            return "PLZ FILL THE EMAIL";

        String regex="^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}";

        Pattern pattern=Pattern.compile(regex);
        if(pattern.matcher(email).matches())
            return "1";
        else
            return "invalid";
    }
}