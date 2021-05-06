package com.example.collegeapp;

public class AssignmentDownloadHelperClass {
    String subjectname,assignmentname,duedate;

    public AssignmentDownloadHelperClass(String subjectname, String assignmentname, String duedate) {
        this.subjectname = subjectname;
        this.assignmentname = assignmentname;
        this.duedate = duedate;
    }

    public String getSubjectname() {
        return subjectname;
    }

    public void setSubjectname(String subjectname) {
        this.subjectname = subjectname;
    }

    public String getAssignmentname() {
        return assignmentname;
    }

    public void setAssignmentname(String assignmentname) {
        this.assignmentname = assignmentname;
    }

    public String getDuedate() {
        return duedate;
    }

    public void setDuedate(String duedate) {
        this.duedate = duedate;
    }



}
