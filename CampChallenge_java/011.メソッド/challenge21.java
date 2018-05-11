/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Akirabear
 */
public class challenge21 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    String[] method (String id) {
          String[] data1 = new String[3];
          data1[0] = "001";
          data1[1] = "1月4日<br>";
          data1[2] = "神奈川県横浜市<br>";
          String[] data2 = new String[3];
          data2[0] = "002";
          data2[1] = "3月4日<br>";
          data2[2] = "東京都品川区<br>";
          String[] data3 = new String[3];
          data3[0] = "003";
          data3[1] = "6月21日<br>";
          data3[2] = "null";
          String[] error = new String[2];
          error[1] = "IDが間違っています。";
          if(id.equals(data1[0])){
              return data1;
          }if(id.equals(data2[0])){
              return data2;
          }if(id.equals(data3[0])){
              return data3;
          }else{
              return error;
          }
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String num1 = "001";
            for (int i=0; i<=2; i++){
                if(i==0){
                    continue;
                }
                if(method(num1)[i].equals("null")){
                    continue;
                }
                out.print(method(num1)[i]);
            }
            String num2 = "002";
            for (int i=0; i<=2; i++){
                if(i==0){
                    continue;
                }
                if(method(num2)[i].equals("null")){
                    continue;
                }
                out.print(method(num2)[i]);
            }
            String num3 = "003";
            for (int i=0; i<=2; i++){
                if(i==0){
                    continue;
                }
                if(method(num3)[i].equals("null")){
                    continue;
                }
                out.print(method(num3)[i]);
            }
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
        processRequest(request, response);
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
