/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.bean.BookingBean;
import com.dao.BookingDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author apitz
 */
public class RefundServlet extends HttpServlet {

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
            out.println("<title>Servlet RefundServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RefundServlet at " + request.getContextPath() + "</h1>");
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
        
        int bookId = Integer.parseInt(request.getParameter("booking_Id"));
        String code = request.getParameter("code");
        String validateRefund = "FAIL"; 
        BookingDao bookDao= new BookingDao();
        
        ArrayList<BookingBean> bookList=new ArrayList<BookingBean>();
        
        bookList=bookDao.selectBooking();

        for(int i=0;i<bookList.size();i++){
            BookingBean temp=(BookingBean) bookList.get(i);
            
            if((temp.getBookingID()==bookId)&&(temp.getCode().equals(code))){
                validateRefund = bookDao.insertRefund(temp);
                bookDao.deleteRefundBook(bookId);
                break;
            } 
        }
 
        if(validateRefund.equals("SUCCESS")) 
         {
             System.out.println("FLAG SUCCESS TO REFUND");
             request.getRequestDispatcher("/refund.jsp").forward(request, response);
         }
         else
         {
             System.out.println("FLAG FAIL TO REFUND");
             request.setAttribute("errMessage", validateRefund); 
             request.getRequestDispatcher("/refund.jsp").forward(request, response);
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
