package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class Assignment extends AppCompatActivity {

    TabLayout assignmenttablayout;
TabItem assignment,upload,reading;
    ViewPager assignmnetPager;
    AssignmentAdapter pageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment);
        assignmenttablayout=findViewById(R.id.assignmenttablayout1);
        assignmnetPager=findViewById(R.id.assignmentpager);
        assignment=findViewById(R.id.assignment_download);
        upload=findViewById(R.id.upload);
        reading=findViewById(R.id.reading);


        pageAdapter= new AssignmentAdapter(getSupportFragmentManager(),assignmenttablayout.getTabCount());

        assignmnetPager.setAdapter(pageAdapter);

        assignmenttablayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                assignmnetPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition()==0 || tab.getPosition()==1|| tab.getPosition()==2  ){
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

        assignmnetPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(assignmenttablayout));


    }
    public void callDashBoard(View view){
        startActivity(new Intent(getApplicationContext(),DashBoard.class));
        finish();
    }
}