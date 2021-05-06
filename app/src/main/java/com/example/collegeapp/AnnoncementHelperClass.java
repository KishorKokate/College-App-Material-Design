package com.example.collegeapp;

public class AnnoncementHelperClass {
    String category,date,annoncetitle,Description,uploadername;



    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUploadername() {
        return uploadername;
    }

    public void setUploadername(String uploadername) {
        this.uploadername = uploadername;
    }

    public String getAnnoncetitle() {
        return annoncetitle;
    }

    public void setAnnoncetitle(String annoncetitle) {
        this.annoncetitle = annoncetitle;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public AnnoncementHelperClass(String category, String date, String annoncetitle, String description,String uploadername) {
        this.category = category;
        this.date = date;
        this.annoncetitle = annoncetitle;
        Description = description;
        this.uploadername = uploadername;
    }
}
