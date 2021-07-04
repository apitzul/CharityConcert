/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.bean.LoginBean;
import com.dao.LoginDao;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author azimd
 */
public class LoginServlet extends HttpServlet {
 
    public LoginServlet() // default constructor
    {
    }
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
       
 
        String username = request.getParameter("username");
        String password = request.getParameter("password");
 
        LoginBean loginBean = new LoginBean(); 
 
        loginBean.setUsername(username); 
        loginBean.setPassword(password);
 
        LoginDao loginDao = new LoginDao(); 
 
        String userValidate = loginDao.authenticateUser(loginBean); 
 
        if(userValidate.equals("SUCCESS")) 
         {
             request.setAttribute("username", username); 
             request.getRequestDispatcher("/home.jsp").forward(request, response);
         }
         else
         {
             request.setAttribute("errMessage", userValidate); 
             request.getRequestDispatcher("/login.jsp").forward(request, response);
         }
    }
}
