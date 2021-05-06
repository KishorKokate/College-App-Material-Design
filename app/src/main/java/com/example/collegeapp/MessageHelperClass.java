package com.example.collegeapp;

import android.widget.TextView;

public class MessageHelperClass {
    String mTitle,mDesc,mSender,mDate;

    public MessageHelperClass(String mTitle, String mDesc, String mSender, String mDate) {
        this.mTitle = mTitle;
        this.mDesc = mDesc;
        this.mSender = mSender;
        this.mDate = mDate;
    }



    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmDesc() {
        return mDesc;
    }

    public void setmDesc(String mDesc) {
        this.mDesc = mDesc;
    }

    public String getmSender() {
        return mSender;
    }

    public void setmSender(String mSender) {
        this.mSender = mSender;
    }

    public String getmDate() {
        return mDate;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }
}
