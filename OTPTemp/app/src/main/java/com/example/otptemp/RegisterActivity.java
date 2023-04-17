package com.example.otptemp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterActivity extends AppCompatActivity {
private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mAuth=FirebaseAuth.getInstance();
        if (mAuth.getCurrentUser()!=null){
            finish();
            return;

        }
        Button register= findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerUser();
            }
        });
        TextView textViewswitchTologin=findViewById(R.id.switchtologin);
        textViewswitchTologin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchTOLogin();
            }
        });
    }



    private void registerUser() {
        EditText first=findViewById(R.id.firstname);
        EditText last=findViewById(R.id.lastname);
        EditText email=findViewById(R.id.email);
        EditText pass=findViewById(R.id.password);

        String firstName=first.getText().toString();
        String lastName=last.getText().toString();
        String emailId=email.getText().toString();
        String password=pass.getText().toString();


        if (firstName.isEmpty() || lastName.isEmpty() || emailId.isEmpty() || password.isEmpty()){
            Toast.makeText(this, "Please fill all the fields", Toast.LENGTH_SHORT).show();
            return;
        }
        mAuth.createUserWithEmailAndPassword(emailId, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            User user=new User(firstName,lastName,emailId);
                            FirebaseDatabase.getInstance().getReference("Users")
                                    .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                    .setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                                        @Override
                                        public void onComplete(@NonNull Task<Void> task) {
                                            showMainActivity();
                                        }
                                    });
                        } else {
                            Toast.makeText(RegisterActivity.this, "Authentication Failed", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }

    private void showMainActivity() {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }
    private void switchTOLogin() {
        Intent intent=new Intent(this,LoginActivity.class);
        startActivity(intent);
        finish();
    }
}