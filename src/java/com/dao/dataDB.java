/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.util.DBconnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author apitz
 */
public class dataDB {
    public int getMaxID(String tableName,String id){
        
        int size=0;
        
        Connection con = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            con = DBconnection.createConnection();
            statement = con.createStatement();
            resultSet = statement.executeQuery("Select MAX("+id+") as count from "+tableName);
            resultSet.next();
            size=resultSet.getInt("count");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return size;
    }
    
    public int nextID(String tableName,String id){
    
        return (getMaxID(tableName,id)+1);
    }
    
    
    public int nextBookID(){
        
        int bookId=0;
        int refundId=0;
        
        String tableName="BOOKING";
        String id="BOOKING_ID";
        
        bookId=getMaxID(tableName,id);
        
        tableName="REFUND";
        id="BOOKING_ID";
        
        refundId=getMaxID(tableName,id);
        
        if(refundId>bookId)
            bookId=refundId+1;
        else
            bookId+=1;
        
        return bookId;
    }
    
}
