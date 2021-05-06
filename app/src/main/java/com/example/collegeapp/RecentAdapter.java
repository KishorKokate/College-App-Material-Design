package com.example.collegeapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecentAdapter extends RecyclerView.Adapter<RecentAdapter.RecentViewHolder> {
    ArrayList<RecentHelperclass> recentviewlocation;

    public RecentAdapter(ArrayList<RecentHelperclass> recentviewlocation) {
        this.recentviewlocation = recentviewlocation;
    }

    @NonNull
    @Override
    public RecentAdapter.RecentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recent_drive_card_design, parent, false);
        RecentViewHolder recentViewHolder = new RecentViewHolder(view);
        return recentViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecentAdapter.RecentViewHolder holder, int position) {
        RecentHelperclass upcomingHelperClass = recentviewlocation.get(position);
        holder.companyname.setText(upcomingHelperClass.getCompanyname());
        holder.streamname.setText(upcomingHelperClass.getStreamname());
        holder.drivedate.setText(upcomingHelperClass.getDrivedate());
        holder.packagename.setText(upcomingHelperClass.getPackagename());

    }

    @Override
    public int getItemCount() {
        return recentviewlocation.size();
    }

    public class RecentViewHolder extends RecyclerView.ViewHolder {
        TextView companyname, streamname, packagename, drivedate;

        public RecentViewHolder(@NonNull View itemView) {
            super(itemView);

            companyname = itemView.findViewById(R.id.recent_company_name);
            streamname = itemView.findViewById(R.id.recent_stream_name);
            packagename = itemView.findViewById(R.id.recent_Package_name);
            drivedate = itemView.findViewById(R.id.recentdrive_date);

        }
    }
}
