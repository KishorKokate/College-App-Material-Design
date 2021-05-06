package com.example.collegeapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.collegeapp.databinding.ActivityAttendanceBinding;
import com.example.collegeapp.databinding.AttendanceCarddesignBinding;

import java.util.ArrayList;

public class Attendance extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;

    ProgressBar progressBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance);

        recyclerView = findViewById(R.id.attendance_rcv);
        progressBar = findViewById(R.id.progress_bar);
        textView = findViewById(R.id.percent_text);

        AttendanceRecyclerView();

    }

   


    private void AttendanceRecyclerView() {
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));


        ArrayList<AttendanceHelperClass> attendanceviewlocation = new ArrayList<>();

        attendanceviewlocation.add(new AttendanceHelperClass("Amruta Surana", "3/15/2021", "20/24", "SPOS"));
        attendanceviewlocation.add(new AttendanceHelperClass("Shubhangi Vaurager", "3/15/2021", "20/24", "WT"));
        attendanceviewlocation.add(new AttendanceHelperClass("Sanjay Sange", "3/15/2021", "20/24", "DAA"));
        attendanceviewlocation.add(new AttendanceHelperClass("Vikas Nandgaonkar", "3/15/2021", "20/24", "ESIOT"));
        attendanceviewlocation.add(new AttendanceHelperClass("Amruta Surana", "3/15/2021", "20/24", "SPOS"));
        attendanceviewlocation.add(new AttendanceHelperClass("Amruta Surana", "3/15/2021", "20/24", "SPOS"));
        attendanceviewlocation.add(new AttendanceHelperClass("Amruta Surana", "3/15/2021", "20/24", "SPOS"));

        adapter = new AttendanceAdapter(attendanceviewlocation);
        recyclerView.setAdapter(adapter);
    }

    public void callDashBoard(View view) {
        startActivity(new Intent(getApplicationContext(), DashBoard.class));
    }
}