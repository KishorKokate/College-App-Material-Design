package com.example.collegeapp;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HappeningOnclickActivity extends AppCompatActivity {

    ImageView img;
    TextView tv1,tv2;
    ImageView back_icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_happening_onclick);
        img=(ImageView)findViewById(R.id.descimage);
        tv1=(TextView)findViewById(R.id.descheader);
        tv2=(TextView)findViewById(R.id.descdesc);
        back_icon = findViewById(R.id.back_icon);

        img.setImageResource(getIntent().getIntExtra("imagename",0));
        tv1.setText(getIntent().getStringExtra("header"));
        tv2.setText(getIntent().getStringExtra("desc"));

        back_icon.setOnClickListener(view -> {
            startActivity(new Intent(getApplicationContext(), DashBoard.class));
            finish();
        });

    }
}