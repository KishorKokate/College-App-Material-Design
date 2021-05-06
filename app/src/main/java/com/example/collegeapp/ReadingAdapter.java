package com.example.collegeapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ReadingAdapter extends RecyclerView.Adapter<ReadingAdapter.ReadingViewHolder> {
    ArrayList<ReadingHelperClass> readingHelperClassArrayList;

    public ReadingAdapter(ArrayList<ReadingHelperClass> readingHelperClassArrayList) {
        this.readingHelperClassArrayList = readingHelperClassArrayList;
    }

    @NonNull
    @Override
    public ReadingAdapter.ReadingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.reading_card_design,parent,false);
       return new ReadingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ReadingAdapter.ReadingViewHolder holder, int position) {

        ReadingHelperClass readingHelperClass=readingHelperClassArrayList.get(position);
        holder.subjectname.setText(readingHelperClass.getSubjectname());
        holder.text.setText(readingHelperClass.getText());

    }

    @Override
    public int getItemCount() {
        return readingHelperClassArrayList.size();
    }

    public class ReadingViewHolder extends RecyclerView.ViewHolder {
        TextView subjectname,text;
        public ReadingViewHolder(@NonNull View itemView) {
            super(itemView);
            subjectname=itemView.findViewById(R.id.reading_subject);
            text=itemView.findViewById(R.id.reading_name);
        }
    }
}
