package com.example.collegeapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {

    ArrayList<LectureHelperClass> LectureviewLocation;

    public RecyclerViewAdapter(ArrayList<LectureHelperClass> lectureviewLocation) {
        this.LectureviewLocation = lectureviewLocation;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lecture_card_design, parent, false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);

        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.RecyclerViewHolder holder, int position) {
        LectureHelperClass lectureHelperClass = LectureviewLocation.get(position);
        holder.time.setText(lectureHelperClass.getTime());
        holder.subject.setText(lectureHelperClass.getSubject());
    }

    @Override
    public int getItemCount() {
        return LectureviewLocation.size();
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder {

        TextView subject, time;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            subject = itemView.findViewById(R.id.subjectname);
            time = itemView.findViewById(R.id.time);

        }
    }
}
