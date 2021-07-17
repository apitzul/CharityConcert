/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.bean.ContactBean;
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
public class ContactDao {
    
    PreparedStatement prepstatement =null;
    Connection con = null;
    Statement statement = null;
    ResultSet resultSet = null;
    PreparedStatement pstmt=null;
    
    public String insertMessageToDB(ContactBean contact){
        
        String fullname= contact.getContactName();
        String email = contact.getContactEmail();
        String subject=contact.getContactSubject();
        String message= contact.getContactMessage();
        
        try
         {
            con = DBconnection.createConnection(); //Fetch database connection object
            String query = "INSERT INTO CONTACT(FULLNAME,EMAIL,SUBJECT,MESSAGE) VALUES(?,?,?,?)";
            pstmt = con.prepareStatement(query);
            
            pstmt.setString(1, fullname);
            pstmt.setString(2, email);
            pstmt.setString(3, subject);
            pstmt.setString(4, message);

            
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
