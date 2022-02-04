package com.example.calendarview;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText uname, pwd;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uname=findViewById(R.id.uname);
        pwd=findViewById(R.id.pwd);
        login=findViewById(R.id.button);
        login.setOnClickListener(view -> {
            if(uname.getText().toString().equals("admin")&&pwd.getText().toString().equals("1234"))
            {
                Toast.makeText(getApplicationContext(),"Login succesful",Toast.LENGTH_LONG).show();
            }
            else
                Toast.makeText(getApplicationContext(),"Wrong credentials",Toast.LENGTH_LONG).show();
        });

    }
}