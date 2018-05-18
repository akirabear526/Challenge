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
import org.camp.servlet.Human;

/**
 *
 * @author Akirabear
 */
public class BlackJackplay extends HttpServlet {

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
        
        Dealer host = new Dealer();
        User player = new User();
        
        try (PrintWriter out = response.getWriter()) {
            out.println("ブラックジャックを始めます。<br>");
            out.println("山札から2枚引いてください<br>");
            host.setCard(host.deal());
            player.setCard(host.deal());
            out.println("あなたが引いたカードは" + player.myCards.get(0) + "と" + player.myCards.get(1) + "です。<br>");
            out.println("ディーラーが引いたカードは" + host.myCards.get(0) + "と**です。<br>");
            while(true){
                if(player.open() > 21){
                    out.println("あなたはバーストしました。<br>");
                    out.println("あなたの負けです。<br>");
                    break;
                }
                if(player.checkSum() == true){
                    player.setCard(host.hit());
                    out.println("あなたはhitを選択しました。<br>");
                    out.println("あなたが引いたカードは" + player.myCards.get(player.myCards.size() - 1) + "です。<br>");
                }else{
                    out.println("あなたはstandを選択しました。<br>");
                    break;
                }
            }
            if(player.open()<=21){
                while(true){
                    if(host.checkSum() == true){
                        host.setCard(host.hit());
                        out.println("ディーラーはhitを選択しました。<br>");
                    }else{
                        out.println("ディーラーはstandを選択しました。<br>");
                        break;
                    }
                }
                out.println("手札を公開してください<br>");
                out.println("あなたのカードの合計値は" + player.open() + "です。<br>");
                out.println("ディーラーのカードの合計値は" + host.open() + "です。<br>");
                if(host.open() > 21){
                    out.println("あなたの勝ちです。<br>");
                }else if(player.open() > host.open()){
                    out.println("あなたの勝ちです。<br>");
                }else{
                    out.println("あなたの負けです。<br>");
                }
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
