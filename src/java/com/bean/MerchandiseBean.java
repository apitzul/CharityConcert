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
public class MerchandiseBean implements java.io.Serializable{
    private int merchandiseID;
    private String merchandiseType;
    private double merchandisePrice;

    public MerchandiseBean(int merchandiseID, String merchandiseType, double merchandisePrice) {
        this.merchandiseID = merchandiseID;
        this.merchandiseType = merchandiseType;
        this.merchandisePrice = merchandisePrice;
    }
    
    public MerchandiseBean() {

    }

    public int getMerchandiseID() {
        return merchandiseID;
    }

    public String getMerchandiseType() {
        return merchandiseType;
    }

    public double getMerchandisePrice() {
        return merchandisePrice;
    }

    public void setMerchandiseID(int merchandiseID) {
        this.merchandiseID = merchandiseID;
    }

    public void setMerchandiseType(String merchandiseType) {
        this.merchandiseType = merchandiseType;
    }

    public void setMerchandisePrice(double merchandisePrice) {
        this.merchandisePrice = merchandisePrice;
    }
    
    
    
    
}
