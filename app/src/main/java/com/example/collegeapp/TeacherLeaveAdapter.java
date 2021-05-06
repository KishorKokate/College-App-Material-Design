package com.example.collegeapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TeacherLeaveAdapter extends RecyclerView.Adapter<TeacherLeaveAdapter.TeacherLeaveViewHolder>{
    ArrayList<TeacherLeaveHelperClass> TeacherviewLocation;

    public TeacherLeaveAdapter(ArrayList<TeacherLeaveHelperClass> teacherviewLocation) {
        TeacherviewLocation = teacherviewLocation;
    }

    @NonNull
    @Override
    public TeacherLeaveViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.teacherleave_card_design,parent,false);
        TeacherLeaveViewHolder teacherLeaveViewHolder=new TeacherLeaveViewHolder(view);
        return teacherLeaveViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TeacherLeaveViewHolder holder, int position) {
        TeacherLeaveHelperClass teacherLeaveHelperClass=TeacherviewLocation.get(position);
        holder.coursename.setText(teacherLeaveHelperClass.getCourseName());
        holder.teachername.setText(teacherLeaveHelperClass.getTeacherName());
        holder.departmentname.setText(teacherLeaveHelperClass.getDepartmentName());
        holder.spantime.setText(teacherLeaveHelperClass.getSpanTime());

    }

    @Override
    public int getItemCount() {
        return TeacherviewLocation.size();
    }

    public class TeacherLeaveViewHolder extends RecyclerView.ViewHolder {
        TextView coursename,teachername,departmentname,spantime;
        public TeacherLeaveViewHolder(@NonNull View itemView) {
            super(itemView);
            coursename=itemView.findViewById(R.id.teacherleave_course_name);
            teachername=itemView.findViewById(R.id.teacher_name);
            departmentname=itemView.findViewById(R.id.department_name);
            spantime=itemView.findViewById(R.id.span_time);

        }
    }
}
