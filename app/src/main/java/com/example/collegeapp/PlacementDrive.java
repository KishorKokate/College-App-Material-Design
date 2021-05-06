package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class PlacementDrive extends AppCompatActivity {
    TabLayout placementTablayout;
    TabItem upcoming, recent;
    ViewPager placementviewPager;
    placementAdapter placementpageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placement_drive);

        placementTablayout = findViewById(R.id.placementlayout);
        upcoming=findViewById(R.id.upcoming);
        recent=findViewById(R.id.recent);
        placementviewPager=findViewById(R.id.placementViewPager);
        placementpageAdapter = new placementAdapter(getSupportFragmentManager(), placementTablayout.getTabCount());

        placementviewPager.setAdapter(placementpageAdapter);


        placementTablayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                placementviewPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition()==0 || tab.getPosition()==1){
                    placementpageAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        placementviewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(placementTablayout));

    }

    public void callDashBoard(View view) {
        startActivity(new Intent(getApplicationContext(), DashBoard.class));
    }

    public void callJobProfile(View view) {
        startActivity(new Intent(getApplicationContext(), JobProfile.class));
    }


}