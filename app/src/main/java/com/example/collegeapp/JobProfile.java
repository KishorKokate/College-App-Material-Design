package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class JobProfile extends AppCompatActivity {

    TextView companyname,streamname,salary,commDate,venue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_profile);

        companyname=findViewById(R.id.JPcompany_name);
        streamname=findViewById(R.id.stream_name_JP);
        salary=findViewById(R.id.salary_details);
        venue=findViewById(R.id.venue_name_JP);
        commDate=findViewById(R.id.comm_date_name);

        companyname.setText(getIntent().getStringExtra("CompanyName"));
        streamname.setText(getIntent().getStringExtra("StreamName"));
        salary.setText(getIntent().getStringExtra("Salary"));
        venue.setText(getIntent().getStringExtra("Venue"));
        commDate.setText(getIntent().getStringExtra("DriveDate"));

    }
    public void callPlacementDrive(View view){
        startActivity(new Intent(getApplicationContext(),PlacementDrive.class));
    }
}