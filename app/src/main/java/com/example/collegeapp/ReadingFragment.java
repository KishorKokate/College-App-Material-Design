package com.example.collegeapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class ReadingFragment extends Fragment {
    RecyclerView readingRCV;
    RecyclerView.Adapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view=inflater.inflate(R.layout.fragment_reading, container, false);
       readingRCV=view.findViewById(R.id.reading_rcv);
       ReadingRecyclerView();


        return view;
    }

    private void ReadingRecyclerView() {

        GridLayoutManager layoutManager = new GridLayoutManager(getContext(), 1);
        readingRCV.setLayoutManager(layoutManager);

        ArrayList<ReadingHelperClass> readingHelperClassArrayList=new ArrayList<>();

        readingHelperClassArrayList.add(new ReadingHelperClass("DAA","Reading Material"));
        readingHelperClassArrayList.add(new ReadingHelperClass("DAA","changing Material"));
        readingHelperClassArrayList.add(new ReadingHelperClass("SPOS","Reading Material"));
        readingHelperClassArrayList.add(new ReadingHelperClass("DAA","Reading Material"));

        adapter=new ReadingAdapter(readingHelperClassArrayList);
        readingRCV.setAdapter(adapter);



    }
}