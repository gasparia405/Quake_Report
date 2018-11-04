package com.example.android.quakereport;

public class Earthquake {

    private Double mMagnitude;
    private String mLocation;
    private String mQuakeDate;
    private String mQuakeTime;
    private String mQuakeUri;

    public Earthquake(Double magnitude, String location, String quakeDate, String quakeTime, String quakeUri){
        mMagnitude = magnitude;
        mLocation = location;
        mQuakeDate = quakeDate;
        mQuakeTime = quakeTime;
        mQuakeUri = quakeUri;
    }


    public Double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {  return mLocation;  }

    public String getQuakeDate() {
        return mQuakeDate;
    }

    public String getQuakeTime() { return mQuakeTime; }

    public String getQuakeUri() { return mQuakeUri; }
}
