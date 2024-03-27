package com.example.gps.model;

public class location {
    private String latitude;
    private String longtitude;
    private String altitude;
    public String getLatitude() {
        return latitude;
    }
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
    public String getLongtitude() {
        return longtitude;
    }
    public void setLongtitude(String longtitude) {
        this.longtitude = longtitude;
    }
    public String getAltitude() {
        return altitude;
    }
    public void setAltitude(String altitude) {
        this.altitude = altitude;
    }
    @Override
    public String toString() {
        return "location [latitude=" + latitude + ", longtitude=" + longtitude + ", altitude=" + altitude + "]";
    }

    
}
