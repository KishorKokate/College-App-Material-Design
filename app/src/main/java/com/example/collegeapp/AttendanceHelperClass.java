package com.example.collegeapp;

import java.util.ArrayList;

public class AttendanceHelperClass {
    String subjectname, facultyname,lastattended,attendedDelivered;

    public AttendanceHelperClass(String facultyname, String lastattended, String attendedDelivered, String subjectname) {
        this.facultyname = facultyname;
        this.lastattended = lastattended;
        this.attendedDelivered = attendedDelivered;
        this.subjectname = subjectname;
    }

    public AttendanceHelperClass(ArrayList<AttendanceHelperClass> attendanceviewlocation) {
    }

    public String getFacultyname() {
        return facultyname;
    }

    public void setFacultyname(String facultyname) {
        this.facultyname = facultyname;
    }

    public String getLastattended() {
        return lastattended;
    }

    public void setLastattended(String lastattended) {
        this.lastattended = lastattended;
    }

    public String getAttendedDelivered() {
        return attendedDelivered;
    }

    public void setAttendedDelivered(String attendedDelivered) {
        this.attendedDelivered = attendedDelivered;
    }

    public String getSubjectname() {
        return subjectname;
    }

    public void setSubjectname(String subjectname) {
        this.subjectname = subjectname;
    }
}
