package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class TimetableActivity extends AppCompatActivity {

    TabLayout tabLayout;
    TabItem mon,tues,wed,thurs,fri;
    ViewPager viewPager;
    PageAdapter pageAdapter;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable);

        img=findViewById(R.id.timetable_back_icon);
        tabLayout=findViewById(R.id.tablayout1);
        mon=findViewById(R.id.monday);
        tues=findViewById(R.id.tuesday);
        wed=findViewById(R.id.wednesday);
        thurs=findViewById(R.id.thursday);
        fri=findViewById(R.id.friday);
        pageAdapter=new PageAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager=findViewById(R.id.vpager);

        viewPager.setAdapter(pageAdapter);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition()==0 || tab.getPosition()==1|| tab.getPosition()==2 || tab.getPosition()==3 ||tab.getPosition()==4 ){
                    pageAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));


        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),DashBoard.class));
            }
        });


    }
}