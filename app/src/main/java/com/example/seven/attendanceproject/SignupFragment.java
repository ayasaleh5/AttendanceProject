package com.example.seven.attendanceproject;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class SignupFragment extends Fragment {



 EditText etEmail, etID, etPassword, etConfirmpassword ;


    public SignupFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_signup, container, false);
        etEmail = view.findViewById(R.id.etEmail);
        etID = view.findViewById(R.id.etID);
        etPassword = view.findViewById(R.id.etPassword);
         etConfirmpassword = view.findViewById(R.id.etconfirmPass);
        Button click = view.findViewById(R.id.btSignup);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });


        return view;
    }




}
