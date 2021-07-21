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
    private int merchandiseStock;
    private String merchandiseType;
    private String merchandiseStatus;
    private double merchandisePrice;

    public MerchandiseBean(int merchandiseID, int merchandiseStock, String merchandiseType, String merchandiseStatus, double merchandisePrice) {
        this.merchandiseID = merchandiseID;
        this.merchandiseStock = merchandiseStock;
        this.merchandiseType = merchandiseType;
        this.merchandiseStatus = merchandiseStatus;
        this.merchandisePrice = merchandisePrice;
    }
   
    public MerchandiseBean() {

    }

    public int getMerchandiseID() {
        return merchandiseID;
    }

    public int getMerchandiseStock() {
        return merchandiseStock;
    }
    
    public String getMerchandiseType() {
        return merchandiseType;
    }

    public String getMerchandiseStatus() {
        return merchandiseStatus;
    }

    public double getMerchandisePrice() {
        return merchandisePrice;
    }

    public void setMerchandiseID(int merchandiseID) {
        this.merchandiseID = merchandiseID;
    }

    public void setMerchandiseStock(int merchandiseStock) {
        this.merchandiseStock = merchandiseStock;
    }

    public void setMerchandiseType(String merchandiseType) {
        this.merchandiseType = merchandiseType;
    }

    public void setMerchandiseStatus(String merchandiseStatus) {
        this.merchandiseStatus = merchandiseStatus;
    }
    
    public void setMerchandisePrice(double merchandisePrice) {
        this.merchandisePrice = merchandisePrice;
    } 

    @Override
    public String toString() {
        return "MerchandiseBean{" + "merchandiseID=" + merchandiseID + ", merchandiseStock=" + merchandiseStock + ", merchandiseType=" + merchandiseType + ", merchandiseStatus=" + merchandiseStatus + ", merchandisePrice=" + merchandisePrice + '}';
    }
    
}
