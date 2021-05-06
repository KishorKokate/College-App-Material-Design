package com.example.collegeapp;

public class UploadHelperClass {
    public UploadHelperClass(String subjectname, String assignname) {
        this.subjectname = subjectname;
        this.assignname = assignname;
    }

    public String getSubjectname() {
        return subjectname;
    }

    public void setSubjectname(String subjectname) {
        this.subjectname = subjectname;
    }

    public String getAssignname() {
        return assignname;
    }

    public void setAssignname(String assignname) {
        this.assignname = assignname;
    }

    String subjectname,assignname;
}
