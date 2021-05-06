package com.example.collegeapp;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Collections;

public class RMSActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String[] MessageType;
    String[] MasterCategory;
    String[] Department,OnlineExam,Administrative,CenterForProfessionalEnhancement,DivisionofAcademicAffairs,DivisionofAdmissions,DivisionofAlumniRelations,DivisionofCareerServices,
            DivisionofExaminationAcademic,DivisionofFinance,DivisionofResidentialServices,DivisionofSecurityandSafety,DivisionofStudentWelfare,DivisionofVendoreandContractorManagement,HouseKeeping,Library,
            MaintenanceComplaints,Transport;

    Spinner spinnerMessageType, spinnerMasterCategory, spinnerDepartment;
    ArrayAdapter AdapterMessageType, AdapterMasterCategory, AdapterDepartment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r_m_s);
        MessageType = getResources().getStringArray(R.array.MessageType);
        MasterCategory = getResources().getStringArray(R.array.MasterCategory);
        OnlineExam=getResources().getStringArray(R.array.OnlineExam);
        Department = getResources().getStringArray(R.array.Department);
        Administrative = getResources().getStringArray(R.array.Administrative);
        CenterForProfessionalEnhancement = getResources().getStringArray(R.array.CenterForProfessionalEnhancement);
        DivisionofAcademicAffairs = getResources().getStringArray(R.array.DivisionofAcademicAffairs);
        DivisionofAdmissions = getResources().getStringArray(R.array.DivisionofAdmissions);
        DivisionofAlumniRelations = getResources().getStringArray(R.array.DivisionofAlumniRelations);
        DivisionofCareerServices = getResources().getStringArray(R.array.DivisionofCareerServices);
        DivisionofExaminationAcademic = getResources().getStringArray(R.array.DivisionofExaminationAcademic);
        DivisionofFinance = getResources().getStringArray(R.array.DivisionofFinance);
        DivisionofResidentialServices = getResources().getStringArray(R.array.DivisionofResidentialServices);
        DivisionofSecurityandSafety = getResources().getStringArray(R.array.DivisionofSecurityandSafety);
        DivisionofStudentWelfare = getResources().getStringArray(R.array.DivisionofStudentWelfare);
        DivisionofVendoreandContractorManagement = getResources().getStringArray(R.array.DivisionofVendoreandContractorManagement);
        HouseKeeping = getResources().getStringArray(R.array.HouseKeeping);
        Library = getResources().getStringArray(R.array.Library);
        MaintenanceComplaints = getResources().getStringArray(R.array.MaintenanceComplaints);
        Transport = getResources().getStringArray(R.array.Transport);



        spinnerMessageType = findViewById(R.id.Message_type_spinner);
        spinnerMessageType.setOnItemSelectedListener(this);

        spinnerMasterCategory = findViewById(R.id.Master_Category_spinner);
        spinnerMasterCategory.setOnItemSelectedListener(this);

        spinnerDepartment = findViewById(R.id.Department_spinner);
        spinnerDepartment.setOnItemSelectedListener(this);

        AdapterMessageType = new ArrayAdapter(this, android.R.layout.simple_spinner_item, MessageType);
        spinnerMessageType.setAdapter(AdapterMessageType);


        spinnerMasterCategory.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    AdapterDepartment = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, OnlineExam);
                }
                if (i == 1) {
                    AdapterDepartment = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, Department);

                }
              if (i == 2) {
                    AdapterDepartment = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, Administrative);

                }
              if (i == 3) {
                    AdapterDepartment = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, CenterForProfessionalEnhancement);

                }
              if (i == 4) {
                    AdapterDepartment = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, DivisionofAcademicAffairs);

                }
              if (i == 5) {
                    AdapterDepartment = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, DivisionofAdmissions);

                }
              if (i == 6) {
                    AdapterDepartment = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, DivisionofAlumniRelations);

                }
              if (i == 7) {
                    AdapterDepartment = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, DivisionofCareerServices);

                }
              if (i == 8) {
                    AdapterDepartment = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, DivisionofExaminationAcademic);

                }
              if (i == 9) {
                    AdapterDepartment = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, DivisionofFinance);

                }
              if (i == 10) {
                    AdapterDepartment = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, DivisionofResidentialServices);

                }
              if (i == 11) {
                    AdapterDepartment = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, DivisionofSecurityandSafety);

                }
              if (i == 12) {
                    AdapterDepartment = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, DivisionofStudentWelfare);

                }
              if (i == 13) {
                    AdapterDepartment = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, DivisionofVendoreandContractorManagement);

                }
              if (i == 14) {
                    AdapterDepartment = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, HouseKeeping);

                }
              if (i == 15) {
                    AdapterDepartment = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, Library);

                }
                if (i == 16) {
                    AdapterDepartment = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, MaintenanceComplaints);

                }
                if (i == 17) {
                    AdapterDepartment = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, Transport);

                }
                spinnerDepartment.setAdapter(AdapterDepartment);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    public void callRMSFragment(View view) {
        startActivity(new Intent(getApplicationContext(), DashBoard.class));
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        int position = i;
       Toast.makeText(getApplicationContext(),
               MasterCategory[position],
                Toast.LENGTH_LONG)
                .show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        Toast.makeText(this, "Nothing is selected", Toast.LENGTH_SHORT).show();

    }
    public void callRMSStatus(View view){
        startActivity(new Intent(getApplicationContext(),RMSRequestStatus.class));
        finish();
    }
    public void callRMSFinal(View view){
        startActivity(new Intent(getApplicationContext(),RMSFinalActivity.class));
        finish();
    }
}