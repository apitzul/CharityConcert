/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;

/**
 *
 * @author azimd
 */
public class AreaBean implements java.io.Serializable{
    private int areaID;
    private String areaName;
    private int areaCapacity;
    private String areaStatus;
    private double areaPrice;

    public AreaBean(int areaID, String areaName, int areaCapacity, String areaStatus, double areaPrice) {
        this.areaID = areaID;
        this.areaName = areaName;
        this.areaCapacity = areaCapacity;
        this.areaStatus = areaStatus;
        this.areaPrice = areaPrice;
    }
    
    public AreaBean() {
 
    }

    public int getAreaID() {
        return areaID;
    }

    public String getAreaName() {
        return areaName;
    }

    public int getAreaCapacity() {
        return areaCapacity;
    }

    public String getAreaStatus() {
        return areaStatus;
    }

    public double getAreaPrice() {
        return areaPrice;
    }

    public void setAreaID(int areaID) {
        this.areaID = areaID;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public void setAreaCapacity(int areaCapacity) {
        this.areaCapacity = areaCapacity;
    }

    public void setAreaStatus(String areaStatus) {
        this.areaStatus = areaStatus;
    }

    public void setAreaPrice(double areaPrice) {
        this.areaPrice = areaPrice;
    }
}
