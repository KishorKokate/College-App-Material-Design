package com.example.collegeapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class RMSFragment extends Fragment {

    Button Agree;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview=inflater.inflate(R.layout.fragment_r_m_s, container, false);

        Agree=rootview.findViewById(R.id.agree_btn);
        Agree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(),RMSActivity.class));
            }
        });
        return rootview;
    }

   


}