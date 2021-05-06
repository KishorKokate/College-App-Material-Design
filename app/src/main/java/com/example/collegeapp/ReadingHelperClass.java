package com.example.collegeapp;

public class ReadingHelperClass {
    String subjectname,text;

    public String getSubjectname() {
        return subjectname;
    }

    public void setSubjectname(String subjectname) {
        this.subjectname = subjectname;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ReadingHelperClass(String subjectname, String text) {
        this.subjectname = subjectname;
        this.text = text;
    }
}
