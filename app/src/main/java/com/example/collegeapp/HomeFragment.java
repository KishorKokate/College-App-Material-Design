package com.example.collegeapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Message;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;


public class HomeFragment extends Fragment {
    ImageView Login;
    RecyclerView.Adapter adapter;
    RecyclerView lectureRecycler;
    CardView card_view, techer_leave, librarysearch, placementdrive, attendance_card, assignment_card,announcement_card;


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_home, container, false);

        lectureRecycler = rootview.findViewById(R.id.lecture_recyclerview);
        lectureRecycler();

        Login = rootview.findViewById(R.id.image_view);
        Login.setOnClickListener(view -> callMessagePage());

        card_view = rootview.findViewById(R.id.lecture_card_view);
        techer_leave = rootview.findViewById(R.id.teacher_leave_card_view);
        librarysearch = rootview.findViewById(R.id.library_search);
        placementdrive = rootview.findViewById(R.id.placement_drive);
        attendance_card = rootview.findViewById(R.id.attendance_card);
        assignment_card = rootview.findViewById(R.id.assignment_card);
        announcement_card=rootview.findViewById(R.id.announcement_card);


        librarysearch.setOnClickListener(view -> startActivity(new Intent(getContext(), LibrarySearch.class)));
        card_view.setOnClickListener(view -> startActivity(new Intent(getContext(), TimetableActivity.class)));
        techer_leave.setOnClickListener(view -> startActivity(new Intent(getContext(), TeacherOnLeave.class)));
        placementdrive.setOnClickListener(view -> startActivity(new Intent(getContext(), PlacementDrive.class)));
        attendance_card.setOnClickListener(view -> startActivity(new Intent(getContext(), Attendance.class)));
        assignment_card.setOnClickListener(view -> startActivity(new Intent(getContext(), Assignment.class)));
        announcement_card.setOnClickListener(view -> startActivity(new Intent(getContext(), Announcement.class)));

        return rootview;
    }

    private void callMessagePage() {
        startActivity(new Intent(getContext(), Messages.class));
    }


    private void lectureRecycler() {

        lectureRecycler.setHasFixedSize(true);
        lectureRecycler.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        ArrayList<LectureHelperClass> LectureviewLocation = new ArrayList<>();

        LectureviewLocation.add(new LectureHelperClass("9-10 AM", "WT"));
        LectureviewLocation.add(new LectureHelperClass("10-11 AM", "DAA"));
        LectureviewLocation.add(new LectureHelperClass("11-12 AM", "IoT"));
        LectureviewLocation.add(new LectureHelperClass("1-2 PM", "SPOS"));
        LectureviewLocation.add(new LectureHelperClass("2-3 PM", "SMD"));
        LectureviewLocation.add(new LectureHelperClass("3-4 PM", "STC"));
        adapter = new RecyclerViewAdapter(LectureviewLocation);
        lectureRecycler.setAdapter(adapter);


    }


}