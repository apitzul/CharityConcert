/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

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
 * @author azimd
 */
public class MerchandiseDao {
    
    PreparedStatement prepstatement =null;
    Connection con = null;
    Statement statement = null;
    ResultSet resultSet = null;
    PreparedStatement pstmt=null;
    
    public ArrayList<MerchandiseBean> selectMerchandise() {
        
        ArrayList<MerchandiseBean> merchList = new ArrayList<MerchandiseBean>();
        
        
        int merchandiseIDDB = 0;
        int merchandiseStockDB = 0;
        String merchandiseTypeDB = "";
        String merchandiseStatusDB = "";
        double merchandisePriceDB = 0.0;
        
        try {
            con = DBconnection.createConnection();
            statement = con.createStatement();
            resultSet = statement.executeQuery("SELECT MERCHANDISE_ID, MERCHANDISE_TYPE, MERCHANDISE_PRICE, MERCHANDISE_STOCK, MERCHANDISE_STATUS FROM MERCHANDISE");
            while (resultSet.next())
            {
                MerchandiseBean merchandiseBean = new MerchandiseBean();
                
                merchandiseIDDB = resultSet.getInt("MERCHANDISE_ID");
                merchandiseTypeDB = resultSet.getString("MERCHANDISE_TYPE");
                merchandisePriceDB = resultSet.getDouble("MERCHANDISE_PRICE");
                merchandiseStockDB = resultSet.getInt("MERCHANDISE_STOCK");
                merchandiseStatusDB = resultSet.getString("MERCHANDISE_STATUS");
                
                merchandiseBean.setMerchandiseID(merchandiseIDDB);
                merchandiseBean.setMerchandiseType(merchandiseTypeDB);
                merchandiseBean.setMerchandisePrice(merchandisePriceDB);
                merchandiseBean.setMerchandiseStock(merchandiseStockDB);
                merchandiseBean.setMerchandiseStatus(merchandiseStatusDB);
                
                merchList.add(merchandiseBean);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return merchList;
    }
    
     public double getTotalMerch() {
        
        double totalMerchDB=0.0;

        try {
            con = DBconnection.createConnection();
            statement = con.createStatement();
            resultSet = statement.executeQuery("SELECT SUM(MERCHANDISE.MERCHANDISE_PRICE)AS TOTAL\n" +
                                                "FROM BOOKING\n" +
                                                "INNER JOIN MERCHANDISE\n" +
                                                "ON BOOKING.MERCHANDISE_ID = MERCHANDISE.MERCHANDISE_ID");
            while (resultSet.next())
            {
                totalMerchDB = resultSet.getDouble("TOTAL");
                return totalMerchDB;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return totalMerchDB;
    }
}
