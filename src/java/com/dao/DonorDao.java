/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.bean.DonorBean;
import com.util.DBconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author azimd
 */
public class DonorDao {
    
    PreparedStatement prepstatement =null;
    Connection con = null;
    Statement statement = null;
    ResultSet resultSet = null;
    PreparedStatement pstmt=null;
    
    public String insertDonor(DonorBean donorBean){
       
        int donorID = donorBean.getDonorID();
        String donorName = donorBean.getDonorName();
        String donorGender= donorBean.getDonorGender();
        int donorAge= donorBean.getDonorAge();
        String donorEmail= donorBean.getDonorEmail();
        String donorPhone= donorBean.getDonorPhone();
       
        try
         {
            con = DBconnection.createConnection(); //Fetch database connection object
            String query = "INSERT INTO DONOR(DONOR_ID,DONOR_FULL_NAME,DONOR_GENDER,DONOR_AGE,DONOR_EMAIL,DONOR_PHONE_NUMBER) VALUES(?,?,?,?,?,?)";
            pstmt = con.prepareStatement(query);
            
            pstmt.setInt(1, donorID);
            pstmt.setString(2, donorName);
            pstmt.setString(3, donorGender);
            pstmt.setInt(4, donorAge);
            pstmt.setString(5, donorEmail);
            pstmt.setString(6, donorPhone);
            
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
    

