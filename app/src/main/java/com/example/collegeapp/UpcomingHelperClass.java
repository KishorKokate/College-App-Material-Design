package com.example.collegeapp;

import android.widget.Button;

public class UpcomingHelperClass {

    String companyname, venuename, streamname, packagename, drivedate, registerdate;
    Button viewprofile;

    public Button getViewprofile() {
        return viewprofile;
    }

    public void setViewprofile(Button viewprofile) {
        this.viewprofile = viewprofile;
    }

    public UpcomingHelperClass(Button viewprofile) {
        this.viewprofile = viewprofile;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getVenuename() {
        return venuename;
    }

    public void setVenuename(String venuename) {
        this.venuename = venuename;
    }

    public String getStreamname() {
        return streamname;
    }

    public void setStreamname(String streamname) {
        this.streamname = streamname;
    }

    public String getPackagename() {
        return packagename;
    }

    public void setPackagename(String packagename) {
        this.packagename = packagename;
    }

    public String getDrivedate() {
        return drivedate;
    }

    public void setDrivedate(String drivedate) {
        this.drivedate = drivedate;
    }

    public String getRegisterdate() {
        return registerdate;
    }

    public void setRegisterdate(String registerdate) {
        this.registerdate = registerdate;
    }

    public UpcomingHelperClass(String companyname, String venuename, String streamname, String packagename, String drivedate, String registerdate) {
        this.companyname = companyname;
        this.venuename = venuename;
        this.streamname = streamname;
        this.packagename = packagename;
        this.drivedate = drivedate;
        this.registerdate = registerdate;
    }
}
