
package com.example.collegeapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class AssignmentFragment extends Fragment {
    RecyclerView assignmentRCV;
    RecyclerView.Adapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view=inflater.inflate(R.layout.fragment_assignment, container, false);
       assignmentRCV=view.findViewById(R.id.assignment_rcv);
       AssignmentRecycler();


        return view;
    }

    private void AssignmentRecycler() {

        GridLayoutManager layoutManager = new GridLayoutManager(getContext(), 1);
        assignmentRCV.setLayoutManager(layoutManager);

        ArrayList<AssignmentDownloadHelperClass> assignmentlocation=new ArrayList<>();

        assignmentlocation.add(new AssignmentDownloadHelperClass("SPOS","Assignment Number 1","20/3/2021"));
        assignmentlocation.add(new AssignmentDownloadHelperClass("WT","Assignment Number 1","20/3/2021"));
        assignmentlocation.add(new AssignmentDownloadHelperClass("WT","Assignment Number 2","20/3/2021"));
        assignmentlocation.add(new AssignmentDownloadHelperClass("ESIOT","Assignment Number 1","20/3/2021"));
        assignmentlocation.add(new AssignmentDownloadHelperClass("SEPM","Assignment Number 4","20/3/2021"));
        assignmentlocation.add(new AssignmentDownloadHelperClass("SPOS","Assignment Number 1","20/3/2021"));
        assignmentlocation.add(new AssignmentDownloadHelperClass("SPOS","Assignment Number 1","20/3/2021"));
        assignmentlocation.add(new AssignmentDownloadHelperClass("SPOS","Assignment Number 1","20/3/2021"));

        adapter=new AssignmentDownloadAdapter(assignmentlocation);
        assignmentRCV.setAdapter(adapter);
    }
}