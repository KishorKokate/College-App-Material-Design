package com.example.collegeapp;

public class LectureHelperClass {
    String time,subject;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public LectureHelperClass(String time, String subject) {
        this.time = time;
        this.subject = subject;
    }
}
