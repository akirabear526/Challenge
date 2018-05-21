/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;
import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author Akirabear
 */
public class challenge33 {
    public static void main(String[] args) throws IOException{
        
        File fl = new File("java2.text");
        FileWriter fw = new FileWriter(fl);
        Date start = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        fw.write("処理を開始します。時刻は" + sdf1.format(start) + "です。");
        fw.write("Mathクラスを使用して平方根の計算を行います。");
        double answer = Math.sqrt(5);
        fw.write("5の平方根は" + answer + "です。");
        Date end = new Date();
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        fw.write("処理を終了します。時刻は" + sdf2.format(end) + "です。");
        fw.close();
    }
}
