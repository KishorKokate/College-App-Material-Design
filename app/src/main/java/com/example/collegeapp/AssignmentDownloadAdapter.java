package com.example.collegeapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AssignmentDownloadAdapter extends RecyclerView.Adapter<AssignmentDownloadAdapter.AssignmentViewHolder> {

    ArrayList<AssignmentDownloadHelperClass> assignmentviewlocation;

    public AssignmentDownloadAdapter(ArrayList<AssignmentDownloadHelperClass> assignmentviewlocation) {
        this.assignmentviewlocation = assignmentviewlocation;
    }

    @NonNull
    @Override
    public AssignmentDownloadAdapter.AssignmentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.assignment_download_card_design,parent,false);
        return new AssignmentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AssignmentDownloadAdapter.AssignmentViewHolder holder, int position) {

        AssignmentDownloadHelperClass assignmentDownloadHelperClass=assignmentviewlocation.get(position);
        holder.subjectname.setText( assignmentDownloadHelperClass.getSubjectname());
        holder.assignmentname.setText( assignmentDownloadHelperClass.getAssignmentname());
        holder.duedate.setText( assignmentDownloadHelperClass.getDuedate());

    }

    @Override
    public int getItemCount() {
        return assignmentviewlocation.size();
    }

    public class AssignmentViewHolder extends RecyclerView.ViewHolder {
        TextView subjectname,assignmentname,duedate;
        public AssignmentViewHolder(@NonNull View itemView) {
            super(itemView);
            subjectname=itemView.findViewById(R.id.assignment_subject);
            assignmentname=itemView.findViewById(R.id.assignment_name);
            duedate=itemView.findViewById(R.id.due_date);
        }
    }
}
