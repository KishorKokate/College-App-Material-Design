package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AnnouncementNextPage extends AppCompatActivity {

    TextView title,date,description,uploadername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_announcement_next_page);

        title=findViewById(R.id.announc_title);
        date=findViewById(R.id.announc_Date);
        description=findViewById(R.id.announc_discription);
        uploadername=findViewById(R.id.uploader_name);

        title.setText(getIntent().getStringExtra("Title"));
        date.setText(getIntent().getStringExtra("Date"));
        description.setText(getIntent().getStringExtra("Description"));
        uploadername.setText(getIntent().getStringExtra("Uploader"));



    }

    public void callDashBoard(View view){
        startActivity(new Intent(getApplicationContext(),Announcement.class));
    }
}