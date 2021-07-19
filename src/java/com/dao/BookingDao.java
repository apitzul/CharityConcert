/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.bean.BookingBean;
import com.util.DBconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author apitz
 */
public class BookingDao {
    
    PreparedStatement prepstatement =null;
    Connection con = null;
    Statement statement = null;
    ResultSet resultSet = null;
    PreparedStatement pstmt=null;
    
    public String insertBooking(BookingBean bookingBean){
       
        int bookingID = bookingBean.getBookingID();
        int donorID= bookingBean.getDonorID();
        int merchandiseID= bookingBean.getMerchandiseID();
        double totalPrice= bookingBean.getTotalPrice();
        double addValue= bookingBean.getAddValue();
        double finalPrice= bookingBean.getFinalPrice();
        String bookingDate= bookingBean.getBookingDate();
       
        try
         {
            con = DBconnection.createConnection(); //Fetch database connection object
            String query = "INSERT INTO BOOKING(BOOKING_ID,DONOR_ID,MERCHANDISE_ID,BOOKING_DATE,ADD_VALUE,FINAL_PRICE,TOTAL_PRICE) VALUES(?,?,?,?,?,?,?)";
            pstmt = con.prepareStatement(query);
            
            pstmt.setInt(1, bookingID);
            pstmt.setInt(2, donorID);
            pstmt.setInt(3, merchandiseID);
            pstmt.setString(4, bookingDate);
            pstmt.setDouble(5, addValue);
            pstmt.setDouble(6, finalPrice);
            pstmt.setDouble(7, totalPrice);
            
            int R = pstmt.executeUpdate();
            if(R!=0) {
                return "SUCCESS";
            }
            return "Invalid user credentials"; // Return appropriate message in case of failure
        } catch (SQLException ex) {
            System.out.println("Error Message : " + ex.toString());
        }
        return "oops";
    }
 
    public String insertBookingArea(int bookingId,int areaId,int num){
       
        try
         {
            con = DBconnection.createConnection(); //Fetch database connection object
            String query = "INSERT INTO BOOKINGAREA(BOOKING_ID,AREA_ID,NUM) VALUES(?,?,?)";
            pstmt = con.prepareStatement(query);
            
            pstmt.setInt(1, bookingId);
            pstmt.setInt(2, areaId);
            pstmt.setInt(3, num);
           
            
            int R = pstmt.executeUpdate();
            if(R!=0) {
                return "SUCCESS";
            }
            return "Invalid user credentials"; // Return appropriate message in case of failure
        } catch (SQLException ex) {
            System.out.println("Error Message : " + ex.toString());
        }
        return "oops";
    }
    
    
}
