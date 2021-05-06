package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RMSRequestStatus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r_m_s_request_status);
    }
    public void callRMSREquest(View view){
        startActivity(new Intent(getApplicationContext(),RMSActivity.class));
        finish();
    }
}