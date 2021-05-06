package com.example.collegeapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class DashBoard extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    static final float END_SCALE = 0.5f;

    //bottom menu
    ChipNavigationBar chipNavigationBar;
Button viewprofile;

    //Drawer Menu
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ImageView imageView;
    LinearLayout contentView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_dashboard);


        //Menu Hooks
        drawerLayout = findViewById(R.id.Drawer_layout);
        navigationView = findViewById(R.id.navigation_view);
        imageView = findViewById(R.id.menu_icon);
        contentView = findViewById(R.id.content);
        View header=navigationView.getHeaderView(0);
        viewprofile=header.findViewById(R.id.view_profile_btn);

        viewprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ProfileActivity.class));
            }
        });





        //Navigation Drawer
        navigationView();


        //Bottom Navigation Bar
        chipNavigationBar = findViewById(R.id.bottomnav);
        chipNavigationBar.setItemSelected(R.id.menu_home,true);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
        bottomMenu();


    }
    /////  public void callProfileActivity(View view){
    //      startActivity(new Intent(this,ProfileActivity.class));
    // }


    //Bottom Navigaton Bar
    private void bottomMenu() {
        chipNavigationBar.bringToFront();
        chipNavigationBar.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int i) {
                Fragment fragment = null;
                switch (i) {
                    case R.id.menu_home:


                        fragment = new HomeFragment();
                        break;
                    case R.id.menu_happening:
                        fragment = new HappeningFragment();
                        break;
                    case R.id.menu_rms:
                        fragment = new RMSFragment();
                        break;

                    case R.id.menu_quick_quiz:
                        fragment = new QuickQuizFragment();
                        break;


                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();

            }
        });
    }

    //Navigation Drawer Function
    private void navigationView() {


        navigationView.bringToFront();
        navigationView.setNavigationItemSelectedListener((NavigationView.OnNavigationItemSelectedListener) this);
        navigationView.setCheckedItem(R.id.nav_home);


        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (drawerLayout.isDrawerVisible(GravityCompat.START)) {
                    drawerLayout.closeDrawer(GravityCompat.START);
                } else drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        animateNavigationDrawer();
    }

    private void animateNavigationDrawer() {
        drawerLayout.setScrimColor(getResources().getColor(R.color.banner_background_light));
        drawerLayout.addDrawerListener(new DrawerLayout.DrawerListener() {
            @Override
            public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {

                final float diffScaledOffset = slideOffset * (1 - END_SCALE);
                final float offsetScale = 1 - diffScaledOffset;
                contentView.setScaleX(offsetScale);
                contentView.setScaleY(offsetScale);

                final float xOffset = drawerView.getWidth() * slideOffset;
                final float xOffsetDiff = contentView.getWidth() * diffScaledOffset / 2;
                final float xTranslation = xOffset - xOffsetDiff;
                contentView.setTranslationY(xTranslation);
            }

            @Override
            public void onDrawerOpened(@NonNull View drawerView) {

            }

            @Override
            public void onDrawerClosed(@NonNull View drawerView) {

            }

            @Override
            public void onDrawerStateChanged(int newState) {

            }
        });


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.nav_home:
                startActivity(new Intent(getApplicationContext(), DashBoard.class));
                break;

            case R.id.nav_logout:
                startActivity(new Intent(getApplicationContext(), Login.class));
                finish();
                break;

            case R.id.nav_profile:
                startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
                break;

            case R.id.nav_search:
                startActivity(new Intent(getApplicationContext(), TimetableActivity.class));
                break;
            case R.id.nav_messages:
                startActivity(new Intent(getApplicationContext(),Messages.class));
                finish();
                break;

            case R.id.nav_teacher_on_leave:
                startActivity(new Intent(getApplicationContext(),TeacherOnLeave.class));
                break;

            case R.id.nav_library_search:
                startActivity(new Intent(getApplicationContext(),LibrarySearch.class));
                break;

            case R.id.nav_attendance:
                startActivity(new Intent(getApplicationContext(),Attendance.class));
                break;

            case R.id.nav_assignment_marks:
                startActivity(new Intent(getApplicationContext(),Assignment.class));
                break;
            case R.id.nav_announcement:
                startActivity(new Intent(getApplicationContext(),Announcement.class));
                finish();
                break;
            case R.id.nav_transport_facility:
                startActivity(new Intent(getApplicationContext(),TransportFacility.class));
                finish();
                break;


        }
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerVisible(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);

        } else
            super.onBackPressed();
    }




}