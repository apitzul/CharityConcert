/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.bean.MerchandiseBean;
import com.dao.MerchandiseDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author apitz
 */
public class AddMerchStockServlet extends HttpServlet {

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
            out.println("<title>Servlet AddMerchStockServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddMerchStockServlet at " + request.getContextPath() + "</h1>");
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("FLAG INTO SERVLET");
        
        int stock = Integer.parseInt(request.getParameter("merchandiseStock"));
        int id = Integer.parseInt(request.getParameter("merchandiseId"));
        int currentStock = Integer.parseInt(request.getParameter("merchandiseCurrentStock"));
        
        MerchandiseDao merchDao = new MerchandiseDao(); 
        MerchandiseBean merchBean =new MerchandiseBean();
        
        merchBean.setMerchandiseID(id);
        merchBean.setMerchandiseStock(currentStock+stock);
        merchBean.setMerchandiseStatus("Available");
        
        String userValidate = merchDao.updateMerch(merchBean); 
        
 
        if(userValidate.equals("SUCCESS")) 
         {

             System.out.println("FLAG SUCCESS TO LOGIN");
             request.setAttribute("succMessage", userValidate); 
             request.getRequestDispatcher("/areaMerchTable.jsp").forward(request, response);
         }
         else
         {
             System.out.println("FLAG FAIL TO LOGIN");            
             request.getRequestDispatcher("/areaMerchTable.jsp").forward(request, response);
         }
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
