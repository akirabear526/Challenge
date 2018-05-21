/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

import java.io.*;

/**
 *
 * @author Akirabear
 */
class challenge32 {
    public static void main(String[] args) throws IOException {
        
        File fp = new File("javatest1.txt");
        FileWriter fw = new FileWriter (fp);
        fw.write("私の名前は久万 顕です。");
        fw.write("生年月日は8月13日です。");
        fw.write("趣味は音楽鑑賞です。");
        fw.close();
    }
    
}
