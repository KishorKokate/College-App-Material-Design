package com.example.collegeapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UpcomingAdapter extends RecyclerView.Adapter<UpcomingAdapter.UpcomingViewHolder> {

    ArrayList<UpcomingHelperClass> upcomingviewlocation;
    ArrayList<UpcomingHelperClass> backup;
    Context context;

    public UpcomingAdapter(ArrayList<UpcomingHelperClass> upcomingviewlocation,  Context context) {
        this.upcomingviewlocation = upcomingviewlocation;
        this.context = context;
        backup=new ArrayList<>(upcomingviewlocation);
    }



    @NonNull
    @Override
    public UpcomingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.upcoming_drive_card_design,parent,false);
        UpcomingViewHolder upcomingViewHolder=new UpcomingViewHolder(view);

        return upcomingViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull UpcomingViewHolder holder, int position) {

        final UpcomingHelperClass temp = upcomingviewlocation.get(position);

        UpcomingHelperClass upcomingHelperClass=upcomingviewlocation.get(position);
        holder.companyname.setText(upcomingHelperClass.getCompanyname());
        holder.venuename.setText(upcomingHelperClass.getVenuename());
        holder.streamname.setText(upcomingHelperClass.getStreamname());
        holder.drivedate.setText(upcomingHelperClass.getDrivedate());
        holder.registerdate.setText(upcomingHelperClass.getRegisterdate());
        holder.packagename.setText(upcomingHelperClass.getPackagename());


        holder.viewprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,JobProfile.class);
                intent.putExtra("CompanyName", temp.getCompanyname());
                intent.putExtra("StreamName", temp.getStreamname());
                intent.putExtra("Venue",temp.getVenuename());
                intent.putExtra("Salary",temp.getPackagename());
                intent.putExtra("DriveDate",temp.getDrivedate());

                context.startActivity(intent);
            }
        });




    }

    @Override
    public int getItemCount() {
        return upcomingviewlocation.size();
    }

    public class UpcomingViewHolder extends RecyclerView.ViewHolder {
        TextView companyname,venuename,streamname,drivedate,registerdate,packagename;
        Button viewprofile;
        public UpcomingViewHolder(@NonNull View itemView) {
            super(itemView);

            companyname=itemView.findViewById(R.id.company_name);
            venuename=itemView.findViewById(R.id.venue_name);
            streamname=itemView.findViewById(R.id.stream_name);
            drivedate=itemView.findViewById(R.id.drive_date_date);
            registerdate=itemView.findViewById(R.id.registerby_date);
            packagename=itemView.findViewById(R.id.Package_name);
            viewprofile=itemView.findViewById(R.id.view_job_profile_btn);

        }
    }
}
