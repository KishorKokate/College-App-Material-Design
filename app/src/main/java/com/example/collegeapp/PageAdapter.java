package com.example.collegeapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class PageAdapter extends FragmentPagerAdapter {

int tabcount;
    public PageAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount=behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new MondayFragment();
            case 1:return new TuesFragment();
            case 2:return new WedFragment();
            case 3:return new ThursFragment();
            case 4:return new FriFragment();
            default:return null;

        }
    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
