package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class Messages extends AppCompatActivity  {
    TextView messageTitle,messageDesc,sederName,messageDate;
    RecyclerView.Adapter messageadapter;
    RecyclerView messageRCV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);

        messageRCV=findViewById(R.id.message_rcv);
        MessageRecyclerView();
        messageTitle=findViewById(R.id.message_title);
        sederName=findViewById(R.id.sender_name);
        messageDesc=findViewById(R.id.message_description);
        messageDate=findViewById(R.id.message_date);


    }

    private void MessageRecyclerView() {

        messageRCV.setHasFixedSize(true);
        messageRCV.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));

        ArrayList<MessageHelperClass> messageViewLocation = new ArrayList<>();

        messageViewLocation.add(new MessageHelperClass("Reminder to complete current Level in third party practice platform","Dear Students, It is inform you that you have not cleared your current level of Hitbullseye platform .Kindly adhere the given dealine as today is the last date to complete your current level.","Teacher Name","(Mar 15 2021)"));
        messageViewLocation.add(new MessageHelperClass("Reminder to complete current Level in third party practice platform","Dear Students, It is inform you that you have not cleared your current level of Hitbullseye platform .Kindly adhere the given dealine as today is the last date to complete your current level.","Teacher Name","(Mar 15 2021)"));
        messageViewLocation.add(new MessageHelperClass("Reminder to complete current Level in third party practice platform","Dear Students, It is inform you that you have not cleared your current level of Hitbullseye platform .Kindly adhere the given dealine as today is the last date to complete your current level.","Teacher Name","(Mar 15 2021)"));
        messageViewLocation.add(new MessageHelperClass("Reminder to complete current Level in third party practice platform","Dear Students, It is inform you that you have not cleared your current level of Hitbullseye platform .Kindly adhere the given dealine as today is the last date to complete your current level.","Teacher Name","(Mar 15 2021)"));
        messageViewLocation.add(new MessageHelperClass("Reminder to complete current Level in third party practice platform","Dear Students, It is inform you that you have not cleared your current level of Hitbullseye platform .Kindly adhere the given dealine as today is the last date to complete your current level.","Teacher Name","(Mar 15 2021)"));
        messageViewLocation.add(new MessageHelperClass("Reminder to complete current Level in third party practice platform","Dear Students, It is inform you that you have not cleared your current level of Hitbullseye platform .Kindly adhere the given dealine as today is the last date to complete your current level.","Teacher Name","(Mar 15 2021)"));
        messageViewLocation.add(new MessageHelperClass("Online Assignment 3","Dear Students, It is inform you that you have not cleared your current level of Hitbullseye platform .Kindly adhere the given dealine as today is the last date to complete your current level.","Teacher Name","(Mar 15 2021)"));
        messageViewLocation.add(new MessageHelperClass("Online Assignment 3","Dear Students, It is inform you that you have not cleared your current level of Hitbullseye platform .Kindly adhere the given dealine as today is the last date to complete your current level.","Teacher Name","(Mar 15 2021)"));
        messageViewLocation.add(new MessageHelperClass("Online Assignment 3","Dear Students, It is inform you that you have not cleared your current level of Hitbullseye platform .Kindly adhere the given dealine as today is the last date to complete your current level.","Teacher Name","(Mar 15 2021)"));
        messageViewLocation.add(new MessageHelperClass("Reminder to complete current Level in third party practice platform","Dear Students, It is inform you that you have not cleared your current level of Hitbullseye platform .Kindly adhere the given dealine as today is the last date to complete your current level.","Teacher Name","(Mar 15 2021)"));
        messageViewLocation.add(new MessageHelperClass("Reminder to complete current Level in third party practice platform","Dear Students, It is inform you that you have not cleared your current level of Hitbullseye platform .Kindly adhere the given dealine as today is the last date to complete your current level.","Teacher Name","(Mar 15 2021)"));
        messageViewLocation.add(new MessageHelperClass("Reminder to complete current Level in third party practice platform","Dear Students, It is inform you that you have not cleared your current level of Hitbullseye platform .Kindly adhere the given dealine as today is the last date to complete your current level.","Teacher Name","(Mar 15 2021)"));
        messageViewLocation.add(new MessageHelperClass("Reminder to complete current Level in third party practice platform","Dear Students, It is inform you that you have not cleared your current level of Hitbullseye platform .Kindly adhere the given dealine as today is the last date to complete your current level.","Teacher Name","(Mar 15 2021)"));

        messageadapter = new MessageRecyclerViewAdapter(messageViewLocation);
        messageRCV.setAdapter(messageadapter);


    }

    public void callDashBoard(View view){
        startActivity(new Intent(getApplicationContext(),DashBoard.class));
    }
}