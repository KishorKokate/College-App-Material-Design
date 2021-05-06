package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class TransportFacility extends AppCompatActivity {

    Button OK;
    Button terms;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transport_facility);
        terms = findViewById(R.id.terms_condition);

        terms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.show();
            }
        });


        dialog = new Dialog(TransportFacility.this);
        dialog.setContentView(R.layout.terms_and_condition);

        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.setCancelable(true);
        OK = dialog.findViewById(R.id.terms_ok_btn);
        OK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(TransportFacility.this, "you clicked ok", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });


    }

    public void callDashBoard(View view) {
        startActivity(new Intent(getApplicationContext(), DashBoard.class));
    }
}