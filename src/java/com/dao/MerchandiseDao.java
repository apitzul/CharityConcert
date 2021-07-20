/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.bean.MerchandiseBean;
import com.util.DBconnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author azimd
 */
public class MerchandiseDao {
    
    public ArrayList<MerchandiseBean> selectMerchandise() {
        
        ArrayList<MerchandiseBean> merchList = new ArrayList<MerchandiseBean>();
        
        
        Connection con = null;
        Statement statement = null;
        ResultSet resultSet = null;
        int merchandiseIDDB = 0;
        String merchandiseTypeDB = "";
        double merchandisePriceDB = 0.0;
        
        try {
            con = DBconnection.createConnection();
            statement = con.createStatement();
            resultSet = statement.executeQuery("SELECT MERCHANDISE_ID, MERCHANDISE_TYPE, MERCHANDISE_PRICE FROM MERCHANDISE");
            while (resultSet.next())
            {
                MerchandiseBean merchandiseBean = new MerchandiseBean();
                
                merchandiseIDDB = resultSet.getInt("MERCHANDISE_ID");
                merchandiseTypeDB = resultSet.getString("MERCHANDISE_TYPE");
                merchandisePriceDB = resultSet.getDouble("MERCHANDISE_PRICE");
                
                merchandiseBean.setMerchandiseID(merchandiseIDDB);
                merchandiseBean.setMerchandiseType(merchandiseTypeDB);
                merchandiseBean.setMerchandisePrice(merchandisePriceDB);
                
                merchList.add(merchandiseBean);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return merchList;
    }
    
}
