/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.bean.BookingBean;
import com.bean.MerchandiseBean;
import com.util.DBconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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
        String code= bookingBean.getCode();
       
        try
         {
            con = DBconnection.createConnection(); //Fetch database connection object
            String query = "INSERT INTO BOOKING(BOOKING_ID,DONOR_ID,MERCHANDISE_ID,BOOKING_DATE,ADD_VALUE,FINAL_PRICE,TOTAL_PRICE,CODE) VALUES(?,?,?,?,?,?,?,?)";
            pstmt = con.prepareStatement(query);
            
            pstmt.setInt(1, bookingID);
            pstmt.setInt(2, donorID);
            pstmt.setInt(3, merchandiseID);
            pstmt.setString(4, bookingDate);
            pstmt.setDouble(5, addValue);
            pstmt.setDouble(6, finalPrice);
            pstmt.setDouble(7, totalPrice);
            pstmt.setString(8, code);
            
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
    
    public String deleteRefundBook(int bookingId){
       
        try
         {
            con = DBconnection.createConnection(); //Fetch database connection object
            String query = "DELETE FROM BOOKING WHERE BOOKING_ID=?";
            pstmt = con.prepareStatement(query);
            
            pstmt.setInt(1, bookingId);           
            
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
    
    public String insertRefund(BookingBean bookingBean){
       
        int bookingID = bookingBean.getBookingID();
        int donorID= bookingBean.getDonorID();
        int merchandiseID= bookingBean.getMerchandiseID();
        double totalPrice= bookingBean.getTotalPrice();
        double addValue= bookingBean.getAddValue();
        double finalPrice= bookingBean.getFinalPrice();
        String bookingDate= bookingBean.getBookingDate();
        String code= bookingBean.getCode();
       
        try
         {
            con = DBconnection.createConnection(); //Fetch database connection object
            String query = "INSERT INTO REFUND(BOOKING_ID,DONOR_ID,MERCHANDISE_ID,BOOKING_DATE,ADD_VALUE,FINAL_PRICE,TOTAL_PRICE,CODE) VALUES(?,?,?,?,?,?,?,?)";
            pstmt = con.prepareStatement(query);
            
            pstmt.setInt(1, bookingID);
            pstmt.setInt(2, donorID);
            pstmt.setInt(3, merchandiseID);
            pstmt.setString(4, bookingDate);
            pstmt.setDouble(5, addValue);
            pstmt.setDouble(6, finalPrice);
            pstmt.setDouble(7, totalPrice);
            pstmt.setString(8, code);
            
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
    
    public ArrayList<BookingBean> selectBooking() {
        
        ArrayList<BookingBean> bookList = new ArrayList<BookingBean>();
        
        
        Connection con = null;
        Statement statement = null;
        ResultSet resultSet = null;
        int bookingIDDB;
        int donorIDDB;
        int merchandiseIDDB;
        double totalPriceDB;
        double addValueDB;
        double finalPriceDB;
        String bookingDateDB;
        String codeDB;
        
        try {
            con = DBconnection.createConnection();
            statement = con.createStatement();
            resultSet = statement.executeQuery("SELECT BOOKING_ID, DONOR_ID, MERCHANDISE_ID, TOTAL_PRICE, ADD_VALUE, FINAL_PRICE, BOOKING_DATE, CODE FROM BOOKING");
            while (resultSet.next())
            {
                BookingBean bookingBean = new BookingBean();
               
                bookingIDDB = resultSet.getInt("BOOKING_ID");
                donorIDDB = resultSet.getInt("DONOR_ID");
                merchandiseIDDB = resultSet.getInt("MERCHANDISE_ID");
                totalPriceDB = resultSet.getDouble("TOTAL_PRICE");
                addValueDB = resultSet.getDouble("ADD_VALUE");
                finalPriceDB = resultSet.getDouble("FINAL_PRICE");
                bookingDateDB = resultSet.getString("BOOKING_DATE");
                codeDB = resultSet.getString("CODE");
                
                bookingBean.setBookingID(bookingIDDB);
                bookingBean.setDonorID(donorIDDB);
                bookingBean.setMerchandiseID(merchandiseIDDB);
                bookingBean.setTotalPrice(totalPriceDB);
                bookingBean.setAddValue(addValueDB);
                bookingBean.setFinalPrice(finalPriceDB);
                bookingBean.setBookingDate(bookingDateDB);
                bookingBean.setCode(codeDB);
                
                bookList.add(bookingBean);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bookList;
    }
}
