package com.example.android.quakereport;

public class Earthquake {

    private String mMagnitude;
    private String mLocation;
    private String mQuakeDate;

    public Earthquake(String magnitude, String location, String quakeDate){
        mMagnitude = magnitude;
        mLocation = location;
        mQuakeDate = quakeDate;
    }


    public String getmLocation() {
        return mLocation;
    }

    public String getmMagnitude() {
        return mMagnitude;
    }

    public String getmQuakeDate() {
        return mQuakeDate;
    }
}
