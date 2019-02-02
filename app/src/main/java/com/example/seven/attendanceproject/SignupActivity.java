package com.example.seven.attendanceproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        getSupportFragmentManager().beginTransaction().replace(R.id.contianer, new SignupFragment()).commit();



    }
}
