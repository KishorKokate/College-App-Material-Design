package com.example.collegeapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class RecentDriveFragment extends Fragment {

    RecyclerView recentRCV;
    RecyclerView.Adapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View rootview=inflater.inflate(R.layout.fragment_recent_drive, container, false);

       recentRCV=rootview.findViewById(R.id.recent_rcv);
       RecentRecyclerView();
        return rootview;
    }

    private void RecentRecyclerView() {
        recentRCV.setHasFixedSize(true);
        recentRCV.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));

        ArrayList<RecentHelperclass> recentviewlocation=new ArrayList<>();
        recentviewlocation.add(new RecentHelperclass("infosys","CS/IT","NA","20 MAR 2021(Confirmed)"));
        recentviewlocation.add(new RecentHelperclass("infosys","CS/IT","NA","20 MAR 2021(Confirmed)"));
        recentviewlocation.add(new RecentHelperclass("infosys","CS/IT","NA","20 MAR 2021(Confirmed)"));
        recentviewlocation.add(new RecentHelperclass("infosys","CS/IT","NA","20 MAR 2021(Confirmed)"));
        recentviewlocation.add(new RecentHelperclass("infosys","CS/IT","NA","20 MAR 2021(Confirmed)"));
        recentviewlocation.add(new RecentHelperclass("infosys","CS/IT","NA","20 MAR 2021(Confirmed)"));
        recentviewlocation.add(new RecentHelperclass("infosys","CS/IT","NA","20 MAR 2021(Confirmed)"));



        adapter=new RecentAdapter(recentviewlocation);
        recentRCV.setAdapter(adapter);
    }
}