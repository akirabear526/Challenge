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
import java.sql.*;

/**
 *
 * @author Akirabear
 */
public class challenge63 extends HttpServlet {

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
            out.println("<title>商品情報入力</title>");            
            out.println("</head>");
            out.println("<body>");
            
            Connection db_con = null;
            PreparedStatement db_st = null;
            ResultSet db_data = null;
            
            try{
                String adress = "jdbc:mysql://localhost:8889/Challenge_db";
                String userID = "Akirabear";
                String pass = "QoiwEa4Z";
                 
                //mymqlに接続
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                db_con = DriverManager.getConnection(adress, userID, pass);
                  
                String sql = "select * from users where name = ? and age = ? and gender = ?";
                //入力データを取得
                db_st = db_con.prepareStatement(sql);
               
                request.setCharacterEncoding("UTF-8");
                String name = request.getParameter("txtName");
                String age = request.getParameter("numAge");
                String gender = request.getParameter("Gender");
                
                db_st.setString(1, name);
                db_st.setString(2, age);
                db_st.setString(3, gender);
                
                db_data = db_st.executeQuery();
                
                while(db_data.next()){
                    out.println("<form action='http://localhost:8080/Challenge2/challenge63_2' method='post'>");
                    out.println("<h2>ログインが確認できました。</h2>");
                    out.println("追加したい商品情報を入力してください。<br><br>");
                    out.println("商品IDを入力してください。<br>");
                    out.println("<input type='text' name='proId'>");
                    out.println("<br><br>商品名を入力してください。<br>");
                    out.println("<input type='text' name='proName'>");
                    out.println("<br><br>商品の個数を入力してください。<br>");
                    out.println("<input type='number' name='proCount'>");
                    out.println("<br><br>");
                    out.println("<input type='submit' value='追加'>");
                    
                }
                
            }catch(SQLException e_sql){         
                out.println("接続時にエラーが発生しました："+e_sql.toString());
            }catch(Exception e){
                out.println("接続時にエラーが発生しました："+e.toString());
            }finally{
                if(db_con != null){
                    try {
                        db_con.close();
                    }catch (Exception e_con){
                        out.println(e_con.getMessage());
                    }
                }
            }
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
