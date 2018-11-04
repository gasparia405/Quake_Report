package com.example.android.quakereport;

public class Earthquake {

    private Double mMagnitude;
    private String mLocation;
    private String mQuakeDate;
    private String mQuakeTime;

    public Earthquake(Double magnitude, String location, String quakeDate, String quakeTime){
        mMagnitude = magnitude;
        mLocation = location;
        mQuakeDate = quakeDate;
        mQuakeTime = quakeTime;
    }


    public Double getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {  return mLocation;  }

    public String getmQuakeDate() {
        return mQuakeDate;
    }

    public String getmQuakeTime() { return mQuakeTime; }
}
