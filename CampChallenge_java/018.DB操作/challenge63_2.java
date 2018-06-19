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
public class challenge63_2 extends HttpServlet {

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
            out.println("<title>商品一覧結果</title>");            
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
                 
                String sql = "insert into product (ID, name, counts) values (?, ?, ?)";
                //入力データを取得
                db_st = db_con.prepareStatement(sql);
               
                request.setCharacterEncoding("UTF-8");
                String id = request.getParameter("proId");
                String name = request.getParameter("proName");
                String counts = request.getParameter("proCount");
                
                db_st.setString(1, id);
                db_st.setString(2, name);
                db_st.setString(3, counts);
                
                int num = db_st.executeUpdate();
                
                sql = "select * from product";
                db_st = db_con.prepareStatement(sql);
                db_data = db_st.executeQuery();
                //記述
                out.println("<h2>商品一覧</h2><br>");
                while(db_data.next()){
                    out.println("商品番号："+ db_data.getInt("ID") +"<br>");
                    out.println("商品名：" + db_data.getString("name") +"<br>");
                    out.println("在庫数：" + db_data.getInt("counts") + "<br><br>");
                }
                
                db_data.close();
                db_st.close();
                db_con.close();  
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
