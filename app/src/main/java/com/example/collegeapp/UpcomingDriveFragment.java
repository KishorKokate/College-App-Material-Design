package com.example.collegeapp;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;


public class UpcomingDriveFragment extends Fragment {

    RecyclerView upcomingRCV;
    RecyclerView.Adapter adapter;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview=inflater.inflate(R.layout.fragment_upcoming_drive, container, false);
        upcomingRCV=rootview.findViewById(R.id.upcoming_rcv);
        UpcomingRecyclerView();


        return rootview;
    }

    private void UpcomingRecyclerView() {

        upcomingRCV.setHasFixedSize(true);
        upcomingRCV.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));

        ArrayList<UpcomingHelperClass> upcomingviewlocation=new ArrayList<>();

        upcomingviewlocation.add(new UpcomingHelperClass("INFOSYS","From your Respective Location","CS/IT","NA","02 Apr 2021 (Confirmed)","28 Mar 2021"));
        upcomingviewlocation.add(new UpcomingHelperClass("google india","From your Respective Location","CS/IT","As per company norms","21 Apr 2021 (Confirmed)","20 Mar 2021"));
        upcomingviewlocation.add(new UpcomingHelperClass("Informatica","From your Respective Location","CS/IT","Stipend Rs. 21000 PM during intership then CTC Rs. 11.4 LPA plus Rs. 1 LPA Bonus based upon performance","Will be Notified Later","12 Mar 2021"));
        upcomingviewlocation.add(new UpcomingHelperClass("cognizant technology solution","From your Respective Location","CS/IT,ENTC","As per company norms","Will be Notified Later","10 Mar 2021"));
        upcomingviewlocation.add(new UpcomingHelperClass("petrcoder","From your Respective Location","CS/IT","As per company norms","02 Apr 2021 (Confirmed)","28 Mar 2021"));
        upcomingviewlocation.add(new UpcomingHelperClass("virtusa","From your Respective Location","CS/IT,MECH","NA","02 Apr 2021 (Confirmed)","28 Mar 2021"));
        upcomingviewlocation.add(new UpcomingHelperClass("TCS","From your Respective Location","CS/IT,ENTC","NA","02 Apr 2021 (Confirmed)","28 Mar 2021"));
        upcomingviewlocation.add(new UpcomingHelperClass("innovaccer","From your Respective Location","CS/IT,MECH","NA","02 Apr 2021 (Confirmed)","28 Mar 2021"));


        adapter=new UpcomingAdapter(upcomingviewlocation,getContext());
        upcomingRCV.setAdapter(adapter);
    }
}