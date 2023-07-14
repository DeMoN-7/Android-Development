package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.Response.ErrorListener;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
TextView t1,t2,t3;
EditText e1;
//    int x=1;
Button b1;
    RequestQueue requestQueue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        b1=findViewById(R.id.b1);
        e1=findViewById(R.id.e1);
        requestQueue = Volley.newRequestQueue(this);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=e1.getText().toString();
                int x=Integer.parseInt(s1);
                JsonObjectRequest jsonArrayReques = new JsonObjectRequest(Request.Method.GET, "https://jsonplaceholder.typicode.com/todos/"+x, null, new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            t1.setText(" "+ response.getString("title"));
                            t2.setText(" "+ response.getString("id"));
                            t3.setText(" "+ response.getString("completed"));
                        } catch (JSONException e) {
                            throw new RuntimeException(e);
                        }
                    }

                }, new ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(MainActivity.this, "Something error", Toast.LENGTH_SHORT).show();
                    }


                });
                requestQueue.add(jsonArrayReques);
            }
        });

    }
}