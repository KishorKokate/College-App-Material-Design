package com.example.collegeapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class UploadAssignmentFragment extends Fragment {
    RecyclerView uploadingRCV;
    RecyclerView.Adapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_upload_assignment, container, false);
        uploadingRCV=view.findViewById(R.id.upload_rcv);
        UploadingRecycler();
        return view;
    }

    private void UploadingRecycler() {
        GridLayoutManager layoutManager = new GridLayoutManager(getContext(), 1);
        uploadingRCV.setLayoutManager(layoutManager);

        ArrayList<UploadHelperClass> uploadlocation=new ArrayList<>();


        uploadlocation.add(new UploadHelperClass("SPOS","Assignment Number 1"));
        uploadlocation.add(new UploadHelperClass("WT","Assignment Number 1"));
        uploadlocation.add(new UploadHelperClass("WT","Assignment Number 2"));
        uploadlocation.add(new UploadHelperClass("ESIOT","Assignment Number 1"));
        uploadlocation.add(new UploadHelperClass("SEPM","Assignment Number 4"));
        uploadlocation.add(new UploadHelperClass("SPOS","Assignment Number 1"));
        uploadlocation.add(new UploadHelperClass("SPOS","Assignment Number 1"));
        uploadlocation.add(new UploadHelperClass("SPOS","Assignment Number 1"));


        adapter=new UploadAdapter(uploadlocation);
        uploadingRCV.setAdapter(adapter);

    }
}