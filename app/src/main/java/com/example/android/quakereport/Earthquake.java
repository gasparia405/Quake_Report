package com.example.android.quakereport;

public class Earthquake {

    private String mMagnitude;
    private String mLocation;
    private String mQuakeDate;
    private String mQuakeTime;

    public Earthquake(String magnitude, String location, String quakeDate, String quakeTime){
        mMagnitude = magnitude;
        mLocation = location;
        mQuakeDate = quakeDate;
        mQuakeTime = quakeTime;
    }


    public String getmMagnitude() {
        return mMagnitude;
    }


    public String getmLocation() {
        return mLocation;
    }

    public String getmQuakeDate() {
        return mQuakeDate;
    }

    public String getmQuakeTime() {
        return mQuakeTime;
    }
}
