package com.java.workshop.temparturedata.beans;

public class Zone {
    private String name;
    private int zoneid;
    private String Stringtype;
    private double area;

    public void setname(String aName){
        name=aName;
    }

    public String getName() {
        return name;
    }

    public void setzoneid(int aZoneid){
        zoneid=aZoneid;
    }

    public int getzoneid(){
       return zoneid;
    }
    public void setstringtype(String aStringtype){
        Stringtype=aStringtype;
    }

    public String getstringtype() {
        return Stringtype ;
    }

    public void setarea(double aArea){
        area=aArea;
    }

    public double getarea(){
       return area;
    }

}
