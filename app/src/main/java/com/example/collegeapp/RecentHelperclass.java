package com.example.collegeapp;

public class RecentHelperclass {
    String companyname,streamname,packagename,drivedate;

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
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

    public RecentHelperclass(String companyname, String streamname, String packagename, String drivedate) {
        this.companyname = companyname;
        this.streamname = streamname;
        this.packagename = packagename;
        this.drivedate = drivedate;
    }
}
