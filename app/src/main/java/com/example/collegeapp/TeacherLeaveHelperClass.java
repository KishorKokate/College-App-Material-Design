package com.example.collegeapp;

public class TeacherLeaveHelperClass {
    String courseName,teacherName,departmentName,spanTime;

    public TeacherLeaveHelperClass(String courseName, String teacherName, String departmentName, String spanTime) {
        this.courseName = courseName;
        this.teacherName = teacherName;
        this.departmentName = departmentName;
        this.spanTime = spanTime;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getSpanTime() {
        return spanTime;
    }

    public void setSpanTime(String spanTime) {
        this.spanTime = spanTime;
    }
}
