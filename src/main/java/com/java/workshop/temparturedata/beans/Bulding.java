package com.java.workshop.temparturedata.beans;

import java.time.LocalDateTime;

public class Bulding {
    private String name;
    private double area;
    private int floors;
    private LocalDateTime opendatetime;
    private LocalDateTime closedatetime;

    public void setname(String aName){
        name=aName;
    }

    public String getName() {
        return name;
    }

    public void setarea(double aArea){
        area=aArea;
    }

    public double getArea(){
       return area;
    }

    public void setfloors(int aFloors){
       floors=aFloors;
    } 
    public int getFloors(){
        return floors;
    }
    public void setOpendatetime(LocalDateTime aOpenDateTime){
        opendatetime=aOpenDateTime;
    }

    public LocalDateTime getopenDateTime() {
        return opendatetime;
    }

    public void setclosedatetime(LocalDateTime aClosDateTime){
        closedatetime=aClosDateTime;
    }

    public LocalDateTime getCloseDateTime(){
       return closedatetime;
    }

    
}