package com.example.collegeapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.collegeapp.databinding.AttendanceCarddesignBinding;

import java.util.ArrayList;

public class AttendanceAdapter extends RecyclerView.Adapter<AttendanceAdapter.AttendanceViewHolder> {

    ArrayList<AttendanceHelperClass> attendanceviewlocation;

    public AttendanceAdapter(ArrayList<AttendanceHelperClass> attendanceviewlocation) {
        this.attendanceviewlocation = attendanceviewlocation;
    }

    @NonNull
    @Override
    public AttendanceAdapter.AttendanceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.attendance_carddesign,parent,false);
        return new AttendanceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AttendanceAdapter.AttendanceViewHolder holder, int position) {
        AttendanceHelperClass attendanceHelperClass=attendanceviewlocation.get(position);

        holder.subjectname.setText(attendanceHelperClass.getSubjectname());
        holder.facultyname.setText(attendanceHelperClass.getFacultyname());
        holder.lastattended.setText(attendanceHelperClass.getLastattended());
        holder.attended.setText(attendanceHelperClass.getAttendedDelivered());



    }

    @Override
    public int getItemCount() {
        return attendanceviewlocation.size();
    }

    public class AttendanceViewHolder extends RecyclerView.ViewHolder {
        TextView subjectname,facultyname,lastattended,attended;
        public AttendanceViewHolder(@NonNull View itemView) {
            super(itemView);
            subjectname=itemView.findViewById(R.id.subject);
            facultyname=itemView.findViewById(R.id.faculty_name);
            lastattended=itemView.findViewById(R.id.last_attended);
            attended=itemView.findViewById(R.id.attended_delivered);
        }
    }
}
