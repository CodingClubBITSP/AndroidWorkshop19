package com.example.ayush.customlistview;

public class ItemChat {

    //member variables (attributes)
    private String mcontact,mtime,mtext;
    private int mImageID;

    //Constructor to initialize member variables
    public ItemChat(String mcontact, String mtime, String mtext, int mImageID) {
        this.mcontact = mcontact;
        this.mtime = mtime;
        this.mtext = mtext;
        this.mImageID=mImageID;
    }

    //Getters below for each member variable

    public String getMcontact() {
        return mcontact;
    }

    public String getMtime() {
        return mtime;
    }


    public String getMtext() {
        return mtext;
    }

    public int getmImageID(){ return mImageID; }

}
