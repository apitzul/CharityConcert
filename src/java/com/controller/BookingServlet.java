/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.bean.AreaBean;
import com.bean.BookingBean;
import com.bean.DonorBean;
import com.dao.dataDB;
import com.bean.LoginBean;
import com.bean.MerchandiseBean;
import com.dao.LoginDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author apitz
 */
@WebServlet(name = "BookingServlet", urlPatterns = {"/BookingServlet"})
public class BookingServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet BookingServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet BookingServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
       
        System.out.println("FLAG INTO SERVLET");
        String fullName = request.getParameter("fullName");
        String age = request.getParameter("age");
        String gender = request.getParameter("gender");
        String phoneNum = request.getParameter("pNumber");
        String email = request.getParameter("email");
        
        String yellowTicket = request.getParameter("yellowTicket");
        String orangeTicket = request.getParameter("orangeTicket");
        String greenTicket = request.getParameter("greenTicket");
        String blueTicket = request.getParameter("blueTicket");

        String merch = request.getParameter("merchandise");
        String extra = request.getParameter("extdonation");
        
        BookingBean bookingBean = new BookingBean(); 
        DonorBean donorBean = new DonorBean();
        MerchandiseBean merchBean = new MerchandiseBean();
        AreaBean areaBean= new AreaBean();
        dataDB table= new dataDB();
        
        donorBean.setDonorID(table.nextID("donor"));
        donorBean.setDonorName(fullName);
        donorBean.setDonorAge(Integer.parseInt(age));
        donorBean.setDonorEmail(email);
        donorBean.setDonorPhone(phoneNum);

        
 

 
        /*if(userValidate.equals("SUCCESS")) 
         {
             System.out.println("FLAG SUCCESS");
             request.setAttribute("username", username); 
             request.getRequestDispatcher("/StaffHomepage.jsp").forward(request, response);
         }
         else
         {
             System.out.println("FLAG FAIL");
             request.setAttribute("errMessage", userValidate); 
             request.getRequestDispatcher("/staffLogin.jsp").forward(request, response);
         }*/
        
    }
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
