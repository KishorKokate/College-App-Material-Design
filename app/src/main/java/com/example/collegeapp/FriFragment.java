package com.example.collegeapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class FriFragment extends Fragment {

    RecyclerView.Adapter adapter;
    RecyclerView lectureRecycler;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_fri, container, false);

        lectureRecycler=rootview.findViewById(R.id.friday_rcv);

        lectureRecycler();


        return rootview;
    }

    private void lectureRecycler() {
        GridLayoutManager layoutManager = new GridLayoutManager(getContext(), 2);
        lectureRecycler.setLayoutManager(layoutManager);

        ArrayList<LectureHelperClass> LectureviewLocation = new ArrayList<>();

        LectureviewLocation.add(new LectureHelperClass("9-10 AM", "WT"));
        LectureviewLocation.add(new LectureHelperClass("10-11 AM", "DAA"));
        LectureviewLocation.add(new LectureHelperClass("11-12 AM", "IoT"));
        LectureviewLocation.add(new LectureHelperClass("1-2 PM", "SPOS"));
        LectureviewLocation.add(new LectureHelperClass("2-3 PM", "SMD"));
        LectureviewLocation.add(new LectureHelperClass("3-4 PM", "STC"));
        LectureviewLocation.add(new LectureHelperClass("3-4 PM", "STC"));
        adapter = new RecyclerViewAdapter(LectureviewLocation);
        lectureRecycler.setAdapter(adapter);


    }
}