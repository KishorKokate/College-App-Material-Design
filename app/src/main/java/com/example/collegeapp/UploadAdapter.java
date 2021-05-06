package com.example.collegeapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UploadAdapter extends RecyclerView.Adapter<UploadAdapter.UploadViewHolder> {
    ArrayList<UploadHelperClass> uploadviewlocation;

    public UploadAdapter(ArrayList<UploadHelperClass> uploadviewlocation) {
        this.uploadviewlocation = uploadviewlocation;
    }

    @NonNull
    @Override
    public UploadViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.upload_card_design,parent,false);
        return new UploadViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UploadViewHolder holder, int position) {

        UploadHelperClass uploadHelperClass=uploadviewlocation.get(position);

        holder.subject.setText(uploadHelperClass.getSubjectname());
        holder.textView.setText(uploadHelperClass.getAssignname());

    }

    @Override
    public int getItemCount() {
        return uploadviewlocation.size();
    }

    public class UploadViewHolder extends RecyclerView.ViewHolder {
        TextView subject,textView;
        public UploadViewHolder(@NonNull View itemView) {
            super(itemView);
            subject=itemView.findViewById(R.id.upload_subject);
            textView=itemView.findViewById(R.id.upload_name);
        }
    }
}
