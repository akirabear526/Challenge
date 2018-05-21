/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

/**
 *
 * @author Akirabear
 */
class challenge31 {
    public static void main(String[] args){
        String word = "きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます";
        String word1 = word.replace("U", "う");
        String word2 = word1.replace("I", "い");
        System.out.println(word2);
    }
    
}
