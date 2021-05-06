package com.example.collegeapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class AssignmentAdapter extends FragmentPagerAdapter {
    int tabcount;

    public AssignmentAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount=behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:return new AssignmentFragment();
            case 1:return new UploadAssignmentFragment();
            case 2:return new ReadingFragment();
            default:return null;
        }
    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
