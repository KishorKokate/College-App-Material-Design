package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class TeacherOnLeave extends AppCompatActivity {
    RecyclerView teacherRCV;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_on_leave);
        teacherRCV=findViewById(R.id.teacher_rcv);
        TecherOnLeave();
    }

    private void TecherOnLeave() {
        teacherRCV.setHasFixedSize(true);
        teacherRCV.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));

        ArrayList<TeacherLeaveHelperClass> teacherViewLocation=new ArrayList<>();

        teacherViewLocation.add(new TeacherLeaveHelperClass("DAA","Sanjay Sange", "Computer","Full"));
        teacherViewLocation.add(new TeacherLeaveHelperClass("SPOS","Amruta", "Computer","10-11"));
        teacherViewLocation.add(new TeacherLeaveHelperClass("WT","Shubhangi Vairager", "Computer","Full"));
        teacherViewLocation.add(new TeacherLeaveHelperClass("Iot","Vikas Nandgaonkar", "Computer","3-4"));
        teacherViewLocation.add(new TeacherLeaveHelperClass("DAA","Sanjay Sange", "Computer","Full"));




        adapter=new TeacherLeaveAdapter(teacherViewLocation);
        teacherRCV.setAdapter(adapter);

    }
    public void callDashBoard(View view){
        startActivity(new Intent(getApplicationContext(),DashBoard.class));
        finish();
    }
}