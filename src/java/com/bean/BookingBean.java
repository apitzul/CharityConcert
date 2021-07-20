/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;

/**
 *
 * @author apitz
 */
public class BookingBean implements java.io.Serializable {
    
    private int bookingID;
    private int donorID;
    private int merchandiseID;
    private double totalPrice;
    private double addValue;
    private double finalPrice;
    private String bookingDate;

    public BookingBean() {
    }

    public BookingBean(int bookingID, int donorID, int merchandiseID, double totalPrice, double addValue, double finalPrice, String bookingDate) {
        this.bookingID = bookingID;
        this.donorID = donorID;
        this.merchandiseID = merchandiseID;
        this.totalPrice = totalPrice;
        this.addValue = addValue;
        this.finalPrice = finalPrice;
        this.bookingDate = bookingDate;
    }

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public int getDonorID() {
        return donorID;
    }

    public void setDonorID(int donorID) {
        this.donorID = donorID;
    }

    public int getMerchandiseID() {
        return merchandiseID;
    }

    public void setMerchandiseID(int merchandiseID) {
        this.merchandiseID = merchandiseID;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getAddValue() {
        return addValue;
    }

    public void setAddValue(double addValue) {
        this.addValue = addValue;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }
    
}